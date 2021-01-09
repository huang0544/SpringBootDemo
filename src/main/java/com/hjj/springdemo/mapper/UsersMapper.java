package com.hjj.springdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjj.springdemo.entity.Users;
import com.hjj.springdemo.from.user.ListUserForm;
import com.hjj.springdemo.vo.UserVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjj
 * @since 2021-01-09
 */
public interface UsersMapper extends BaseMapper<Users> {
    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
    List<UserVo> listUser(ListUserForm listUserForm);
}
