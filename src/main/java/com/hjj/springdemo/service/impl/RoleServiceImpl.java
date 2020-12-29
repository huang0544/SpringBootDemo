package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.entity.Role;
import com.hjj.springdemo.mapper.RoleMapper;
import com.hjj.springdemo.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
