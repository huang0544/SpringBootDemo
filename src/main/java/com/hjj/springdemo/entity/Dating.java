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
public class Dating implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "datingId", type = IdType.AUTO)
    private Integer datingId;

    @TableField("datingSponsorName")
    private String datingSponsorName;

    @TableField("datingSponsorEmail")
    private String datingSponsorEmail;

    @TableField("datingName")
    private String datingName;

    @TableField("datingContent")
    private String datingContent;

    @TableField("datingStartTime")
    private LocalDateTime datingStartTime;

    @TableField("datingOverTime")
    private LocalDateTime datingOverTime;

    @TableField("datingSumpeople")
    private Integer datingSumpeople;

    @TableField("datingCreatetime")
    private LocalDateTime datingCreatetime;

    @TableField("datingUpdatetime")
    private LocalDateTime datingUpdatetime;


}
