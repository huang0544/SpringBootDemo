package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.entity.Users;
import com.hjj.springdemo.mapper.UsersMapper;
import com.hjj.springdemo.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjj
 * @since 2020-11-29
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
