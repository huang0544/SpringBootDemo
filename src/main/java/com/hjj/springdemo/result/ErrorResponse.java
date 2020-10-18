package com.hjj.springdemo.result;

import com.hjj.springdemo.exception.BaseException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.util.ObjectUtils;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @program: SpringBootDemo
 * @description: 这个类作为异常信息返回给客户端，里面包括了当出现异常时我们想要返回给客户端的所有信息。
 * @author: hjj
 * @create: 2020-10-18 15:22
 **/

@Getter
@Setter
@ToString
public class ErrorResponse {
    private int code;//唯一标示异常
    private int status;//http状态码
    private String message;//错误具体信息
    private String path;//错误路径
    private Instant timestamp;//发生错误的时间戳
    private HashMap<String, Object> data = new HashMap<String, Object>();

    public ErrorResponse() {
    }

    public ErrorResponse(BaseException ex, String path) {
        this(ex.getError().getCode(), ex.getError().getStatus().value(), ex.getError().getMessage(), path, ex.getData());
    }

    public ErrorResponse(int code, int status, String message, String path, Map<String, Object> data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

}
