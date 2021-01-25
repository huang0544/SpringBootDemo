package com.hjj.springdemo.security;

import com.hjj.springdemo.entity.Role;
import com.hjj.springdemo.entity.Users;
import com.hjj.springdemo.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SpringBootDemo
 * @description:
 * @author: hjj
 * @create: 2021-01-24 17:08
 **/
@Service
public class CustomUserService implements UserDetailsService {
    @Autowired
    UsersMapper usersMapper;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Users users = usersMapper.findByUserName(name);
        if(users == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        //用于添加用户的权限，只要把用户权限添加到authorities 就万事大吉
        for(Role role:users.getRole())
        {
            authorities.add(new SimpleGrantedAuthority(role.getUsername()));
            System.out.println(role.getUsername());
        }
        return new org.springframework.security.core.userdetails.User(users.getName(),
                users.getPassword(), authorities);
    }
}
