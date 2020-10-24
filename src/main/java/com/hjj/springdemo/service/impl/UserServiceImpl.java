package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.from.user.AddUserForm;
import com.hjj.springdemo.from.user.ListUserForm;
import com.hjj.springdemo.service.UserService;
import com.hjj.springdemo.vo.PageVo;
import com.hjj.springdemo.vo.UserVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @program: springdemo
 * @description: 用户服务实现类
 * @author: hjj
 * @create: 2020-10-24 20:24
 **/
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public boolean addUser(AddUserForm userForm) {
        return false;
    }

    @Override
    public PageVo<UserVo> listUser(ListUserForm listUserForm) {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}
