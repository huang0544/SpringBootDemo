package com.hjj.springdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjj.springdemo.entity.Users;
import com.hjj.springdemo.from.user.ListUserForm;
import com.hjj.springdemo.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjj
 * @since 2021-01-09
 */
@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
    List<UserVo> listUser(ListUserForm listUserForm);

    /**
     * 通过昵称查找用户信息
     * @param name
     * @return
     */
    Users findByUserName(String name);
}
