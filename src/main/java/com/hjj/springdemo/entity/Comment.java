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
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "commentId", type = IdType.AUTO)
    private Integer commentId;

    @TableField("commentArticleId")
    private Integer commentArticleId;

    @TableField("commentContent")
    private String commentContent;

    @TableField("commentByName")
    private String commentByName;

    @TableField("commentByEmail")
    private String commentByEmail;

    @TableField("commentCreateTime")
    private LocalDateTime commentCreateTime;

    @TableField("commentUpdateTime")
    private LocalDateTime commentUpdateTime;


}
