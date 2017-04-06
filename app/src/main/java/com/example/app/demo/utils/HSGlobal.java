package com.example.app.demo.utils;


/**
 * App内存缓存
 */
public class HSGlobal {

    private volatile static HSGlobal instance;
    private String token;
    private String userId = "10000";
    private String userName = "锋";
    private String icon = "Image/20160819/1471570856669.jpeg";

    private HSGlobal() {
    }

    public static HSGlobal getInstance() {
        if (null == instance) {
            synchronized (HSGlobal.class) {
                if (instance == null) {
                    instance = new HSGlobal();
                }
            }
        }
        return instance;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public HSGlobal setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public HSGlobal setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public HSGlobal setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public HSGlobal setToken(String token) {
        this.token = token;
        return this;
    }
}
