package com.example.app.demo.base;

import android.content.Context;


/**
 * author  xyj
 * createtime 2017/4/6 10:27
 * desc 基类presenter
 */
public abstract class BasePresenter<T, E> {
   // public Context mContext;
    public E mModel;
    public T mView;


    public void setViewAndModel(T v, E m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    public void onStart() {
    }

}
