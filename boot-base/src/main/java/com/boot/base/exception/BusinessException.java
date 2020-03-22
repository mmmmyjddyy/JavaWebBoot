package com.boot.base.exception;

import org.springframework.http.HttpStatus;

/**
 * @ClassName BusinessException
 * @Description 自定义业务异常
 * @Author FLZ
 * @Date 2020/3/19 16:34
 * @Version 1.0
 */
public class BusinessException extends RuntimeException {
    private Integer status = HttpStatus.INTERNAL_SERVER_ERROR.value();

    public BusinessException(String msg){
        super(msg);
    }

    public BusinessException(String msg, Throwable cause){
        super(msg,cause);
    }

    public BusinessException(HttpStatus status, String msg){
        super(msg);
        this.status = status.value();
    }
    public BusinessException(HttpStatus status, String msg, Throwable cause){
        super(msg,cause);
        this.status = status.value();
    }
}
