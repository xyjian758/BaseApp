package com.example.app.demo.utils;

import android.text.TextUtils;
import android.util.Log;

import com.example.app.demo.BuildConfig;


/**
 * Created by DELL on 2016/12/8.
 * 空判断，不输出
 */

public class LogUtil {
    private static final boolean isDebugger = BuildConfig.DEBUG;

    public static void e(String message) {
        if (!isDebugger)
            return;
        e("tag", message);
    }

    public static void e(String tag, String message) {
        if (!isDebugger)
            return;
        if (TextUtils.isEmpty(message))
            return;
        Log.e(tag, message);
    }

    public static void w(String message) {
        if (!isDebugger)
            return;

        w("tag", message);
    }

    public static void w(String tag, String message) {
        if (!isDebugger)
            return;
        if (TextUtils.isEmpty(message))
            return;
        Log.w(tag, message);
    }

    public static void i(String message) {
        if (!isDebugger)
            return;
        i("tag", message);
    }

    public static void i(String tag, String message) {
        if (!isDebugger)
            return;
        if (TextUtils.isEmpty(message))
            return;
        Log.i(tag, message);
    }

    public static void d(String message) {
        if (!isDebugger)
            return;
        d("tag", message);
    }

    public static void d(String tag, String message) {
        if (!isDebugger)
            return;
        if (TextUtils.isEmpty(message))
            return;
        Log.d(tag, message);
    }

    public static void v(String message) {
        if (!isDebugger)
            return;
        v("tag", message);
    }

    public static void v(String tag, String message) {
        if (!isDebugger)
            return;
        if (TextUtils.isEmpty(message))
            return;
        Log.v(tag, message);
    }


}
