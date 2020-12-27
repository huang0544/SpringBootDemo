package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.service.MailService;
import com.hjj.springdemo.vo.MailVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import java.util.Date;

/**
 * @program: SpringBootDemo
 * @description: 邮件接口实现类
 * @author: hjj
 * @create: 2020-12-20 18:38
 **/
@Service
public class MailServiceImpl implements MailService {
    private Logger logger = LoggerFactory.getLogger(getClass());//提供日志类

    @Autowired
    private JavaMailSenderImpl mailSender;//注入邮件工具类

    /**
     * 发送邮件
     *
     * @param mailVo
     */
    @Override
    public MailVo sendMail(MailVo mailVo) {
        try {
            checkMail(mailVo);//1.检测邮件
            sendMimeMail(mailVo);//2.发送邮件
            return saveMail(mailVo);//3.保存邮件
        } catch (Exception e) {
            logger.error("发送邮件失败:", e);//打印错误信息
            mailVo.setStatus("fail");
            mailVo.setError(e.getMessage());
            return mailVo;
        }
    }

    /**
     * 保存邮件
     *
     * @param mailVo
     */
    private MailVo saveMail(MailVo mailVo) {
        return mailVo;
    }

    /**
     * 构建复杂邮件信息类
     *
     * @param mailVo
     */
    private void sendMimeMail(MailVo mailVo) {
        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mailSender.createMimeMessage(), true);//true表示支持负责类型
            mailVo.setFrom(getMailSendFrom());//邮件发信人从配置项读取
            messageHelper.setFrom(mailVo.getFrom());//邮件发信人
            messageHelper.setTo(mailVo.getTo().split(","));//邮件收信人
            messageHelper.setSubject(mailVo.getSubject());//邮件主题
            messageHelper.setText(mailVo.getText());//邮件内容
            if (!StringUtils.isEmpty(mailVo.getBcc())) {//密送
                messageHelper.setCc(mailVo.getCc().split(","));
            }
            if (mailVo.getMultipartFiles() != null) {//添加邮件附件
                for (MultipartFile multipartFile : mailVo.getMultipartFiles()) {
                    messageHelper.addAttachment(multipartFile.getOriginalFilename(), multipartFile);
                }
            }
            if (StringUtils.isEmpty(mailVo.getSentDate())) {//发送时间
                mailVo.setSentDate(new Date());
                messageHelper.setSentDate(mailVo.getSentDate());
            }
            mailSender.send(messageHelper.getMimeMessage());//正式发送邮件
            mailVo.setStatus("ok");
            logger.info("发送邮件成功：{}-->{}", mailVo.getFrom(), mailVo.getTo());
//        } catch (Exception e) {
//            throw new RuntimeException(e);//发送失败
//        }
        }catch (MailSendException me){
                detectInvalidAddress(me);
            } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private void detectInvalidAddress(MailSendException me) {
        Exception[] messageExceptions = me.getMessageExceptions();
        if (messageExceptions.length > 0) {
            Exception messageException = messageExceptions[0];
            if (messageException instanceof SendFailedException) {
                SendFailedException sfe = (SendFailedException) messageException;
                Address[] invalidAddresses = sfe.getInvalidAddresses();
                if(invalidAddresses != null) {
                    StringBuilder addressStr = new StringBuilder();
                    for (Address address : invalidAddresses) {
                        addressStr.append(address.toString()).append("; ");
                    }

                    logger.error("发送邮件时发生异常！可能有无效的邮箱：{}", addressStr);
                    return;
                }
            }
        }

        logger.error("发送邮件时发生异常！", me);

    }

    /**
     * 检测邮件信息类
     *
     * @param mailVo
     */
    private void checkMail(MailVo mailVo) {
        if (StringUtils.isEmpty(mailVo.getTo())) {
            throw new RuntimeException("邮件收信人不能为空");
        }
        if (StringUtils.isEmpty(mailVo.getSubject())) {
            throw new RuntimeException("邮件主题不能为空");
        }
        if (StringUtils.isEmpty(mailVo.getText())) {
            throw new RuntimeException("邮件内容不能为空");
        }
    }

    @Override
    public String getMailSendFrom() {
        return mailSender.getJavaMailProperties().getProperty("from");
    }
}
