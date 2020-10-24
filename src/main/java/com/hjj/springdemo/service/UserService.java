package com.hjj.springdemo.service;

import com.hjj.springdemo.from.user.AddUserForm;
import com.hjj.springdemo.from.user.ListUserForm;
import com.hjj.springdemo.vo.PageVo;
import com.hjj.springdemo.vo.UserVo;

/**
 * @program: springdemo
 * @description:
 * @author: hjj
 * @create: 2020-10-22 18:32
 **/
public interface UserService {
    /**
     * 添加用户
     * @param userForm 表单数据
     * @return true 或者 false
     */
    boolean addUser(AddUserForm userForm);

    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
    PageVo<UserVo> listUser(ListUserForm listUserForm);

    /**
     * 删除用户
     * @param id id
     */
    void deleteUser(String id);
}
