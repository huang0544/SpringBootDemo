package com.hjj.springdemo.exception;

import com.hjj.springdemo.enums.ErrorCode;

import java.util.Map;

/**
 * @program: SpringBootDemo
 * @description: 请求数据格式验证失败异常
 * @author: hjj
 * @create: 2020-10-18 17:35
 **/
public class RequestValidationFailedException extends BaseException {
    protected RequestValidationFailedException(Map<String, Object> data) {
        super(ErrorCode.REQUEST_VALIDATION_FAILED, data);
    }
}
