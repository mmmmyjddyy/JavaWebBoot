package com.boot.base.core;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName Result
 * @Description 统一API响应结果封装
 * @Author FLZ
 * @Date 2020/3/18 14:54
 * @Version 1.0
 */
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
