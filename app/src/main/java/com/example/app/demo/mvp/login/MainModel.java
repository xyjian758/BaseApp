package com.example.app.demo.mvp.login;

import com.example.app.demo.base.CommonModel;

import java.util.List;

import rx.Observable;

/**
 * Created by DELL on 2017/4/6.
 */

public class MainModel extends CommonModel implements MainContract.Model {
    @Override
    public Observable<List<String>> testModel() {
        return null;
    }
}
