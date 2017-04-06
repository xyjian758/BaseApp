package com.example.app.demo.mvp.login;

import com.example.app.demo.base.BaseModel;
import com.example.app.demo.base.BasePresenter;
import com.example.app.demo.base.BaseView;
import com.example.app.demo.base.CommonModel;

import java.util.List;

import rx.Observable;

/**
 * Created by DELL on 2017/4/6.
 */

public class MainContract {
        interface Model extends BaseModel {
//        Observable< List<NewsChannelTable> > lodeMineNewsChannels();
        Observable<List<String>> testModel();
    }

    interface View extends BaseView {
//        void returnMineNewsChannels(List<NewsChannelTable> newsChannelsMine);
        void testView();
    }
    abstract static class Presenter extends BasePresenter<View, Model> {
        public abstract void testPresenter();
    }
}
