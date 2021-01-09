package com.hjj.springdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjj.springdemo.entity.Users;
import com.hjj.springdemo.enums.ResultEnum;
import com.hjj.springdemo.exception.CustomException;
import com.hjj.springdemo.from.user.AddUserForm;
import com.hjj.springdemo.from.user.ListUserForm;
import com.hjj.springdemo.mapper.UsersMapper;
import com.hjj.springdemo.service.IUsersService;
import com.hjj.springdemo.utils.MethodUtil;
import com.hjj.springdemo.vo.PageVo;
import com.hjj.springdemo.vo.UserVo;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjj
 * @since 2021-01-09
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {
    private UsersMapper usersMapper;

    /**
     * 添加用户
     * @param userForm 表单数据
     * @return
     */
    @Override
    public boolean addUser(AddUserForm userForm) {
        return save(userForm.buildEntity());
    }

    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
    @Override
    public PageVo<UserVo> listUser(ListUserForm listUserForm) {
        PageVo<UserVo> pageVo = new PageVo<UserVo>().setCurrentAndSize(listUserForm);
        pageVo.setTotal(countUser(listUserForm.getStatus()));
        pageVo.setRecords(usersMapper.listUser(listUserForm.calcCurrent()));
        return pageVo;
    }

    /**
     * 删除用户
     * @param id id
     */
    @Override
    public void deleteUser(String id) {
        // 如果删除失败抛出异常。 -- 演示而已不推荐这样干
        if(!removeById(id)){
            throw new CustomException(ResultEnum.DELETE_ERROR, MethodUtil.getLineInfo());
        }
    }

    /**
     * 获取用户数量
     * @param status 状态
     * @return 用户数量
     */
    private Integer countUser(String status){
        return count(new QueryWrapper<Users>().eq("status",status));
    }
}
