package com.hjj.springdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjj
 * @since 2020-12-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 电话
     */
    private String iphone;

    /**
     * 状态
     */
    private String status;

    /**
     * 角色id
     */
    private Integer roleid;

    /**
     * 新增时间
     */
    @TableField("userCreateTime")
    private LocalDateTime userCreateTime;

    /**
     * 更新时间
     */
    @TableField("userUpdateTime")
    private LocalDateTime userUpdateTime;


}
