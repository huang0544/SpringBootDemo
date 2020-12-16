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
public class Joindating implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "joinId", type = IdType.AUTO)
    private Integer joinId;

    @TableField("joinDatingId")
    private String joinDatingId;

    @TableField("joinDatingSponsorName")
    private String joinDatingSponsorName;

    @TableField("joinDatingSponsorEmail")
    private String joinDatingSponsorEmail;

    @TableField("joinDatingName")
    private String joinDatingName;

    @TableField("joinDatingContent")
    private String joinDatingContent;

    @TableField("joinDatingStartTime")
    private LocalDateTime joinDatingStartTime;

    @TableField("joinDatingOverTime")
    private LocalDateTime joinDatingOverTime;

    @TableField("joinUserName")
    private String joinUserName;

    @TableField("joinUserEmail")
    private String joinUserEmail;

    @TableField("joinUserSex")
    private String joinUserSex;

    @TableField("joinUserIphone")
    private String joinUserIphone;

    @TableField("joinDatingCreatetime")
    private LocalDateTime joinDatingCreatetime;


}
