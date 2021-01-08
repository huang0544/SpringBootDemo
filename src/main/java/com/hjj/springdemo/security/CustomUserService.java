package com.hjj.springdemo.security;

import com.hjj.springdemo.service.IRoleService;
import com.hjj.springdemo.service.IUsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

/**
 * @program: SpringBootDemo
 * @description: 自定义UserDetailsService 接口
 * @author: hjj
 * @create: 2020-12-29 22:16
 **/
public class CustomUserService implements UserDetailsService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private IUsersService usersService;

    @Resource
    private IRoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        return null;
    }
}
