package com.example.app.demo.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.app.demo.application.AppApplication;

/**
 * @author xyj
 * @createtime 2017/1/16 13:43
 * @desc sp工具类
 */
public class SpUtil {
    private static SharedPreferences sp;
    private static SpUtil spUtil;

    private SpUtil() {
        sp = AppApplication.getAppContext().getSharedPreferences(AppConfig.mFileName, Context.MODE_PRIVATE);
    }

    public static SpUtil getInstance() {
        synchronized (SpUtil.class) {
            if (null == spUtil) {
                synchronized (SpUtil.class) {
                    spUtil = new SpUtil();
                }
            }
        }
        return spUtil;
    }

    public SpUtil setStringData(String key, String value) {
        sp.edit().putString(key, value).commit();
        return spUtil;
    }

    public String getStringData(String key, String dValue) {
        return sp.getString(key, dValue);
    }

    public SpUtil setBooleanData(String key, boolean value) {
        sp.edit().putBoolean(key, value).commit();
        return spUtil;
    }

    public Boolean getBooleanData(String key, boolean dValue) {
        return sp.getBoolean(key, dValue);
    }


}
