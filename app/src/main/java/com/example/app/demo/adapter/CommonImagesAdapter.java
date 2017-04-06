package com.example.app.demo.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author xyj
 * @createtime 2017/2/10 9:48
 * @desc 通用的Images展示 viewpager Adapter
 * -----------暂时使用的界面（有增加请添加备注）----------------
 * 商品详情图片展示界面
 * <p>
 *
 */

public class CommonImagesAdapter<T extends View> extends PagerAdapter{
    private List<T> lists;

    public CommonImagesAdapter(List<T> lists) {
        this.lists = lists;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(lists.get(position));
        return lists.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(lists.get(position));

    }

}
