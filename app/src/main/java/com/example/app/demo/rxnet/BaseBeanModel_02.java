package com.example.app.demo.rxnet;

/**
 * @作者 xyj
 * @创建时间 2016/12/8 10:47
 * @描述 返回数据模型是这个样式的  之前岳志强的数据模型
 */
//示例：
//      {
//        "data": {}
//        "status": {
//               code : 200,
//               errorMessage:""
//                  }
//        }

public class BaseBeanModel_02<T> {
    public Status status;
    public T data;

    public class Status {
        public int code;
        public String errorMessage;
    }
}
