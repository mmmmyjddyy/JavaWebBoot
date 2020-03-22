package com.boot.base.core;

/**
 * @ClassName ServiceException
 * @Description 服务（业务）异常如“ 账号或密码错误 ”，该异常只做INFO级别的日志记录 @see WebMvcConfigurer
 * @Author FLZ
 * @Date 2020/3/18 14:56
 * @Version 1.0
 */
public class ServiceException extends RuntimeException {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
