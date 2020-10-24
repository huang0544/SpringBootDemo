package com.hjj.springdemo.from;

/**
 * @program: springdemo
 * @description: 通用表单
 * @author: hjj
 * @create: 2020-10-24 18:25
 **/
public abstract class BaseForm<T> {

    /**
     * 获取实例
     * @return 返回实体类
     */
    public abstract T buildEntity();

}
