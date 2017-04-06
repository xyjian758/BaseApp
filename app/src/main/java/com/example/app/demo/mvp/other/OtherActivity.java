package com.example.app.demo.mvp.other;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.app.demo.R;
import com.example.app.demo.base.MvpActivity;
import com.example.app.demo.canstant.ArouteConstant;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Route(path = ArouteConstant.APP_OTHER)
public class OtherActivity extends MvpActivity {


    @BindView(R.id.tv_other)
    TextView tvOther;

    @Override
    public void initPresenter() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_other;
    }

    @Override
    public void initViewAndData(Bundle savedInstanceState) {

    }


    @OnClick(R.id.tv_other)
    public void onClick() {
        startProgressDialog("跳回主页");
        Observable.timer(5, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        OtherActivity.this.stopProgressDialog();
                        ARouter.getInstance()
                                .build(ArouteConstant.APP_MAIN)
                                .navigation();
                        OtherActivity.this.finish();

                    }
                });
    }
}
