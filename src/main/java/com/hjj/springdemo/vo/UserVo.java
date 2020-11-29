package com.hjj.springdemo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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
    @ApiModelProperty("用户邮箱")
    private String email;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String name;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    private String sex;

    /**
     * 电话
     */
    @ApiModelProperty("电话")
    private String iphone;

}
