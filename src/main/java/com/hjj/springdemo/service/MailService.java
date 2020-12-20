package com.hjj.springdemo.service;

import com.hjj.springdemo.entity.Mail;

/**
 * @program: SpringBootDemo
 * @description: 邮件接口
 * @author: hjj
 * @create: 2020-12-20 18:37
 **/
public interface MailService {

    public void sendSimpleMailMessage(Mail mail);

    public void sendMimeMessage(Mail mail);
}
