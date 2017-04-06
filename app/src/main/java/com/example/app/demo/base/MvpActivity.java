package com.example.app.demo.base;

import android.os.Bundle;

import com.example.app.demo.utils.TUtil;

/**
 * 基类
 */
/***************使用例子*********************/
//1.mvp模式
//public class SampleActivity extends BaseActivity<NewsChanelPresenter, NewsChannelModel>implements NewsChannelContract.View {
//    @Override
//    public int getLayoutId() {
//        return R.layout.activity_news_channel;
//    }
//
//    @Override
//    public void initPresenter() {
//        mPresenter.setVM(this, mModel);
//    }
//
//    @Override
//    public void initView() {
//    }
//}
//2.普通模式
//public class SampleActivity extends BaseActivity {
//    @Override
//    public int getLayoutId() {
//        return R.layout.activity_news_channel;
//    }
//
//    @Override
//    public void initPresenter() {
//    }
//
//    @Override
//    public void initViewAndData() {
//    }
//}
public abstract class MvpActivity<T extends BasePresenter, E extends BaseModel>  extends BaseActivity {
    public T mPresenter;
    public E mModel;

    @Override
    protected void initMvp() {
        mPresenter = TUtil.getT(this, 0);
        mModel= TUtil.getT(this,1);
/*        if(mPresenter!=null){
            mPresenter.mContext=this;
        }*/
        initPresenter();
    }

    /*********************子类实现*****************************/

    //简单页面无需mvp就不用管此方法即可,完美兼容各种实际场景的变通
    public abstract void initPresenter();
    //获取布局文件
    @Override
    public abstract int getLayoutId();
    //初始化view
    @Override
    public abstract void initViewAndData(Bundle savedInstanceState);

}
