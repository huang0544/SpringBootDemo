package com.hjj.springdemo.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author hjj
 * @since 2020-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Users implements Serializable {

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
