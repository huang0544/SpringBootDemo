package com.hjj.springdemo.service;

import com.hjj.springdemo.entity.Mail;

import javax.mail.MessagingException;

/**
 * @program: springdemo
 * @description: 邮件服务接口
 * @author: hjj
 * @create: 2020-12-17 18:40
 **/
public interface MailService {
    // 发送邮件
    void sendMail(Mail mail);

    // 发送Html邮件
    void sendHtmlMail(Mail mail) throws MessagingException;

    // 发送带附件的邮件
    void sendAttachmentsMail(Mail mail) throws MessagingException;

}
