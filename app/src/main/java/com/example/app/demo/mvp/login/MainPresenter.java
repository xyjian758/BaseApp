package com.example.app.demo.mvp.login;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by DELL on 2017/4/6.
 */

public class MainPresenter extends MainContract.Presenter {



    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void testPresenter() {

      mView.showLoading("调到other页面");


        Observable.timer(5, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        mView.testView();
                    }
                });
    }
}
