package com.hjj.springdemo.service;

import com.hjj.springdemo.vo.MailVo;

/**
 * @program: SpringBootDemo
 * @description: 邮件接口
 * @author: hjj
 * @create: 2020-12-20 18:37
 **/
public interface MailService {

    //发送邮件
    MailVo sendMail(MailVo mailVo);

    //获取邮件发信人
    String getMailSendFrom();
}
