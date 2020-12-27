package com.hjj.springdemo.mapper;

import com.hjj.springdemo.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hjj
 * @since 2020-12-16
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
