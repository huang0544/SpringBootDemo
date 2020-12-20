package com.hjj.springdemo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: SpringBootDemo
 * @description: 邮件实体类
 * @author: hjj
 * @create: 2020-12-20 18:31
 **/
@Data
public class Mail {
    private String from;
    private String replyTo;
    private String[] to;
    private String[] cc;
    private String[] bcc;
    private Date sentDate;
    private String subject;
    private String text;
    private String[] filenames;
}
