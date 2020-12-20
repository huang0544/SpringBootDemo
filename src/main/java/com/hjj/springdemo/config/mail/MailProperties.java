package com.hjj.springdemo.config.mail;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @program: SpringBootDemo
 * @description: 邮件配置读取
 * @author: hjj
 * @create: 2020-12-20 19:30
 **/
@Validated
@Component
@ConfigurationProperties(prefix = "mail")
public class MailProperties {
    private String domain;
    private String from;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
