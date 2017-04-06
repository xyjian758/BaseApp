package com.example.app.demo.rxnet;


/**
 * @作者  xyj
 * @创建时间 2016/12/8 10:47
 * @描述  返回数据模型是这个样式的  2016/12/8  针对的是新的接口类型
 */
//示例：
//      {
//        "res": {}
//        "code": "0"
//        }

public class BaseBeanModel_01<T> {
    public String code;
    public T res;
}
