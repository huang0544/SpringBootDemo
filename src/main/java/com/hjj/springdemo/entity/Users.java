package com.hjj.springdemo.entity;

import 你自己的父类实体,没有就不用设置!;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjj
 * @since 2020-11-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Users extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    private String email;

    private String password;

    private String name;

    private String sex;

    private String iphone;

    private Integer roleid;

    @TableField("userCreateTime")
    private LocalDateTime userCreateTime;

    @TableField("userUpdateTime")
    private LocalDateTime userUpdateTime;


}
