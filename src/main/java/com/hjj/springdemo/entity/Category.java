package com.hjj.springdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "categoryId", type = IdType.AUTO)
    private Integer categoryId;

    @TableField("categoryName")
    private String categoryName;

    @TableField("categoryIntroduce")
    private String categoryIntroduce;

    @TableField("categoryUpdateTime")
    private LocalDateTime categoryUpdateTime;


}
