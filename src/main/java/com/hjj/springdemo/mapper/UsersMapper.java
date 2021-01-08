package com.hjj.springdemo.mapper;

import com.hjj.springdemo.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjj
 * @since 2020-12-30
 */
public interface UsersMapper extends BaseMapper<Users> {
    public Users findByUserName(String name);
}
