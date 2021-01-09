package com.hjj.springdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjj.springdemo.entity.Users;
import com.hjj.springdemo.from.user.AddUserForm;
import com.hjj.springdemo.from.user.ListUserForm;
import com.hjj.springdemo.vo.PageVo;
import com.hjj.springdemo.vo.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hjj
 * @since 2021-01-09
 */
public interface IUsersService extends IService<Users> {
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
