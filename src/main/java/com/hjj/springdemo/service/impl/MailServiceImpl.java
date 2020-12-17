package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.entity.Mail;
import com.hjj.springdemo.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.MessagingException;

/**
 * @program: springdemo
 * @description: 邮件服务接口实现类
 * @author: hjj
 * @create: 2020-12-17 18:43
 **/
public class MailServiceImpl implements MailService {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender mailSender;

    @Value("${mail.fromMail.addr}")
    private String mailFrom;

    @Override
    public void sendMail(Mail mail) {

    }

    @Override
    public void sendHtmlMail(Mail mail) throws MessagingException {

    }

    @Override
    public void sendAttachmentsMail(Mail mail) throws MessagingException {

    }
}
