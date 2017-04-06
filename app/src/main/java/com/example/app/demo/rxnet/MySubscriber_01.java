package com.example.app.demo.rxnet;

import android.text.TextUtils;

import rx.Subscriber;

/**
 * @作者 xyj
 * @创建时间 2016/12/8 10:57
 * @描述 针对的数据模型是 BaseBeanModel_01 的
 */

public abstract class MySubscriber_01<T extends BaseBeanModel_01> extends Subscriber<T> {

    private static final String ERROR_01 = "响应失败";//返回数据null
    private static final String ERROR_02 = "403";//登陆失效
    private static final String ERROR_03 = "408";//其他情况 一
    private static final String ERROR_04 = "409";//其他情况 二
    private static final String ERROR_05 = "352";// methodId无效 --> 服务器问题
    private static final String ERROR_06 = "";//其他情况 四

    @Override
    public void onNext(T t) {
        if (null == t) {
            _onError(ERROR_01);
            return;
        }
        if (TextUtils.equals("0", t.code)) {
            _onNext(t);
        } else {
            _onError(switchCode(t.code));
        }
    }

    @Override
    public void onError(Throwable e) {
        _onError(switchErrorMsg(e));
    }

    @Override
    public void onCompleted() {

    }

    public abstract void _onNext(T t);

    public abstract void _onError(String errorMsg);

    private String switchCode(String code) {
        String msg = code;
        if (TextUtils.isEmpty(msg)) {
            msg = "";
        }
        switch (code) {
            case ERROR_02://登陆失效状态，清除登陆状态
                break;
        }
        return msg;
    }

    private String switchErrorMsg(Throwable e) {
        String msg = "网络异常";
        if (null == e) {
            return msg;
        }
        String message = e.getMessage();
        if (!TextUtils.isEmpty(message) && message.contains("Forbidden") || TextUtils.equals("HTTP 403 Forbidden", e.getMessage())) {
            msg = ERROR_02;
        }
        return message;
    }
}
