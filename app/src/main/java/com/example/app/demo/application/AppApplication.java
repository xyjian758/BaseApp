package com.example.app.demo.application;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;


/**
 * author  xyj
 * createtime 2017/4/6 9:24
 * desc 当前应用的application，完成对应用的初始化
 */
public class AppApplication extends Application {
    private static AppApplication appApplication;
    private static RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化应用所需的参数
        appApplication = this;

        initData();
    }

    private void initData() {
        //初始化 阿里的arouter 跳转框架
        ARouter.init(this);
        //内存泄露检测工具
        refWatcher = LeakCanary.install(this);


    }

    public static RefWatcher getRefWatcher() {
        if (null == refWatcher)
            refWatcher = LeakCanary.install(appApplication);
        return refWatcher;
    }

    public static AppApplication getAppContext() {
        return appApplication;
    }
}
