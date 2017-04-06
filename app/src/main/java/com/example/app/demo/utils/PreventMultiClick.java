package com.example.app.demo.utils;

/**
 * Created by admin on 2016/7/5.
 */
public class PreventMultiClick {
    private static long lastClickTime;
    //判断是否连续点击
    /*
    * 固定防止连点时间
    * */
    public synchronized static boolean isFastClick() {
        long time = System.currentTimeMillis();
        if ( time - lastClickTime < 1300) {
            return true;
        }
        lastClickTime = time;
        return false;
    }

    /*
    *
    * 动态设置 点击时间间隔
    * @param millisecond  :毫秒
    * */
    public synchronized static boolean isFastClick(int millisecond) {
        long time = System.currentTimeMillis();
        if ( time - lastClickTime < millisecond) {
            return true;
        }
        lastClickTime = time;
        return false;
    }


}
