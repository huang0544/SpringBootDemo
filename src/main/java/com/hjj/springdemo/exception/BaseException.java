package com.hjj.springdemo.exception;

import com.hjj.springdemo.enums.ErrorCode;
import lombok.Getter;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: SpringBootDemo
 * @description: 继承自 RuntimeException 的抽象类，可以看做系统中其他异常类的父类
 * @author: hjj
 * @create: 2020-10-18 15:23
 **/
@Getter
public abstract class BaseException extends RuntimeException {
    private final ErrorCode error;
    private final HashMap<String, Object> data = new HashMap<>();

    public BaseException(ErrorCode error, Map<String, Object> data) {
        super(error.getMessage());
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    protected BaseException(ErrorCode error, Map<String, Object> data, Throwable cause) {
        super(error.getMessage(), cause);
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

}
