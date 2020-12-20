package com.hjj.springdemo.service.impl;

import com.github.dozermapper.core.Mapper;
import com.hjj.springdemo.config.mail.MailProperties;
import com.hjj.springdemo.entity.Mail;
import com.hjj.springdemo.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;

/**
 * @program: SpringBootDemo
 * @description: 邮件接口实现类
 * @author: hjj
 * @create: 2020-12-20 18:38
 **/
@Service
public class MailServiceImpl implements MailService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MailProperties mailProperties;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private Mapper mapper;

    @Override
    public void sendSimpleMailMessage(Mail mail) {
        SimpleMailMessage simpleMailMessage = mapper.map(mail, SimpleMailMessage.class);
        if (StringUtils.isEmpty(mail.getFrom())) {
            mail.setFrom(mailProperties.getFrom());
        }
        javaMailSender.send(simpleMailMessage);
    }

    @Override
    public void sendMimeMessage(Mail mail) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper;
        try {
            messageHelper = new MimeMessageHelper(mimeMessage, true);

            if (StringUtils.isEmpty(mail.getFrom())) {
                messageHelper.setFrom(mailProperties.getFrom());
            }
            messageHelper.setTo(mail.getTo());
            messageHelper.setSubject(mail.getSubject());

            mimeMessage = messageHelper.getMimeMessage();
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(mail.getText(), "text/html;charset=UTF-8");

            // 描述数据关系
            MimeMultipart mm = new MimeMultipart();
            mm.setSubType("related");
            mm.addBodyPart(mimeBodyPart);

            //添加邮件附件
            for(String filename:mail.getFilenames()){
                MimeBodyPart attachPart = new MimeBodyPart();
                try {
                    attachPart.attachFile(filename);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mm.addBodyPart(attachPart);
            }
            mimeMessage.setContent(mm);
            mimeMessage.saveChanges();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }
}
