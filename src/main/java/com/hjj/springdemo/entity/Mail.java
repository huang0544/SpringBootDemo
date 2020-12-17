package com.hjj.springdemo.entity;

import lombok.Data;

/**
 * @program: springdemo
 * @description: 发邮件实体类
 * @author: hjj
 * @create: 2020-12-17 18:39
 **/
@Data
public class Mail {

    // 发送给谁
    private String to;

    // 发送主题
    private String subject;

    // 发送内容
    private String content;

    // 附件地址
    private String filePath;
}

