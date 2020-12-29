package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.entity.RoleUser;
import com.hjj.springdemo.mapper.RoleUserMapper;
import com.hjj.springdemo.service.IRoleUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjj
 * @since 2020-12-29
 */
@Service
public class RoleUserServiceImpl extends ServiceImpl<RoleUserMapper, RoleUser> implements IRoleUserService {

}
