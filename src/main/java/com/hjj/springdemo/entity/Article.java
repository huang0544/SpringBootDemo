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
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "articleId", type = IdType.AUTO)
    private Integer articleId;

    @TableField("articleCategoryId")
    private Integer articleCategoryId;

    @TableField("articleCategoryName")
    private String articleCategoryName;

    @TableField("articleName")
    private String articleName;

    @TableField("articleSponsorName")
    private String articleSponsorName;

    @TableField("articleSponsorEmail")
    private String articleSponsorEmail;

    @TableField("articleContent")
    private String articleContent;

    @TableField("articleCreateTime")
    private LocalDateTime articleCreateTime;

    @TableField("articleUpdateTime")
    private LocalDateTime articleUpdateTime;


}
