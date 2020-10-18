package com.hjj.springdemo.exception;

import com.hjj.springdemo.result.ErrorCode;

import java.util.Map;

/**
 * @program: SpringBootDemo
 * @description: 未找到该资源
 * @author: hjj
 * @create: 2020-10-18 17:11
 **/
public class ResourceNotFoundException extends BaseException {
    public ResourceNotFoundException(Map<String, Object> data) {
        super(ErrorCode.RESOURCE_NOT_FOUND, data);
    }
}
