package com.hjj.springdemo.service.impl;

import com.hjj.springdemo.entity.Comment;
import com.hjj.springdemo.mapper.CommentMapper;
import com.hjj.springdemo.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
