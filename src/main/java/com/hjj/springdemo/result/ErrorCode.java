package com.hjj.springdemo.result;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

/**
 * @program: SpringBootDemo
 * @description: 此枚举类中包含了异常的唯一标识、HTTP状态码以及错误信息，这个类的主要作用就是统一管理系统中可能出现的异常，比较清晰明了。
 *               可能出现的问题是当系统过于复杂，出现的异常过多之后，这个类会比较庞大。
 *               有一种解决办法：将多种相似的异常统一为一个，比如将用户找不到异常和订单信息未找到的异常都统一为“未找到该资源”这一种异常，然后前端再对相应的情况做详细处理
 * @author: hjj
 * @create: 2020-10-18 12:36
 **/
@Getter
@ToString
public enum ErrorCode {
    RESOURCE_NOT_FOUND(1001, HttpStatus.NOT_FOUND, "未找到该资源"),
    REQUEST_VALIDATION_FAILED(1002, HttpStatus.BAD_REQUEST, "请求数据格式验证失败");
    private final int code;

    private final HttpStatus status;

    private final String message;

    ErrorCode(int code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

}
