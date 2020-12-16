package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.entity.Dating;
import com.hjj.springdemo.mapper.DatingMapper;
import com.hjj.springdemo.service.IDatingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjj
 * @since 2020-12-16
 */
@Service
public class DatingServiceImpl extends ServiceImpl<DatingMapper, Dating> implements IDatingService {

}
