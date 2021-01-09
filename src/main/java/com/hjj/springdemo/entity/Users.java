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
 * @since 2021-01-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String email;

    private String password;

    private String name;

    private String sex;

    private String iphone;

    /**
     * 状态
     */
    private String status;

    private Integer roleid;

    @TableField("userCreateTime")
    private LocalDateTime userCreateTime;

    @TableField("userUpdateTime")
    private LocalDateTime userUpdateTime;


}
