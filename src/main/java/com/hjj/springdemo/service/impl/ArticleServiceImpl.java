package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.entity.Article;
import com.hjj.springdemo.mapper.ArticleMapper;
import com.hjj.springdemo.service.IArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
