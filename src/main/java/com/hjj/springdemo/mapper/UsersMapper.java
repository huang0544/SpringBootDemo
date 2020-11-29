package com.hjj.springdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjj.springdemo.entity.Users;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjj
 * @since 2020-11-29
 */
public interface UsersMapper extends BaseMapper<Users> {
    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
}
