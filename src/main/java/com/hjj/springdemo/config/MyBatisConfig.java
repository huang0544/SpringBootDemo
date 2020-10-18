package com.hjj.springdemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: SpringBootDemo
 * @description: MyBatis配置类
 * @author: hjj
 * @create: 2020-10-15 22:34
 **/
@Configuration
@MapperScan("com.springdemo.mbg.mapper")
public class MyBatisConfig {
}
