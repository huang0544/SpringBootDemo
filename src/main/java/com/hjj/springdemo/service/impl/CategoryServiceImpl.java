package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.entity.Category;
import com.hjj.springdemo.mapper.CategoryMapper;
import com.hjj.springdemo.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
