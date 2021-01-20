package com.hjj.springdemo.from.user;

import com.hjj.springdemo.from.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: springdemo
 * @description: 获取用户列表需要的表单数据
 * @author: hjj
 * @create: 2020-10-24 18:28
 **/
@Data
@ApiModel("获取用户列表需要的表单数据")
@EqualsAndHashCode(callSuper = false)
public class ListUserForm extends PageForm<ListUserForm> {

    /**
     * 用户状态
     */
    @ApiModelProperty("用户状态")
//    @NotEmpty(message = "用户状态不能为空")
//    @Range(min =  -1 , max = 1 , message = "用户状态有误")
    private String status;

}
