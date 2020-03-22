package com.boot.base.data;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @ClassName BaseResponse
 * @Description BaseResponse
 * @Author FLZ
 * @Date 2020/3/19 16:53
 * @Version 1.0
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private String msg;
    private T data;
    private String token;
    public BaseResponse() {

    }
    public BaseResponse(int code, String msg, T data, String token) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.token = token;
    }
    public BaseResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public BaseResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public BaseResponse(int code, String msg, String token) {
        this.code = code;
        this.msg = msg;
        this.token = token;
    }

    public static BaseResponse ok(Object o) {
        return new BaseResponse(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),o);
    }
    public static BaseResponse ok(String msg) {
        return new BaseResponse(HttpStatus.OK.value(), msg);
    }

    public static BaseResponse ok(String msg,Object o) {
        return new BaseResponse(HttpStatus.OK.value(), msg,o);
    }
    public static BaseResponse failure(String msg) {
        return new BaseResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
    }
    public static BaseResponse failure( Object o) {
        return new BaseResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),o);
    }
    public static BaseResponse failure( int code,String msg) {
        return new BaseResponse(code,msg );
    }
}
