package com.hjj.springdemo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @program: springdemo
 * @description: 用户视图模型
 * @author: hjj
 * @create: 2020-10-24 18:27
 **/
@Data
@ApiModel("用户视图模型")
public class UserVo {

    /**
     * 用户编号
     */
    @ApiModelProperty("用户编号")
    private Integer id;

    /**
     * 昵称
     */
    @ApiModelProperty("昵称")
    private String nickname;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String username;

    /**
     * 生日
     */
    @ApiModelProperty("生日")
    private LocalDateTime birthday;

}
