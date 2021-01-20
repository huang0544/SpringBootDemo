package com.hjj.springdemo.from.user;

import com.hjj.springdemo.entity.Users;
import com.hjj.springdemo.from.BaseForm;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

/**
 * @program: springdemo
 * @description: 添加用户需要的表单数据
 * @author: hjj
 * @create: 2021-01-09 15:52
 **/
@Data
@ApiOperation("添加用户需要的表单数据")
@EqualsAndHashCode(callSuper = false)
public class AddUserForm extends BaseForm<Users> {
    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
//    @NotEmpty(message = "邮箱不能为空")
//    @Email
    private String email;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
//    @NotEmpty(message = "用户名不能为空")
//    @Length(min = 1 , max = 16 , message = "用户名长度限制为1~16")
    private String name;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
//    @NotEmpty(message = "密码不能为空")
//    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[._~!@#$^&*])[A-Za-z0-9._~!@#$^&*]{8,20}$" , message = "密码不符合规范")
    private String password;

    /**
     * 手机号码
     */
    @ApiModelProperty("手机号码")
//    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
//    @NotBlank(message = "手机号码不能为空")
    private String iphone;

    /**
     * 性别
     */
    @ApiModelProperty("性别")
    private String sex;

    /**
     * 构造实体
     * @return 实体对象
     */
    @Override
    public Users buildEntity() {
        Users users = new Users();
        BeanUtils.copyProperties(this,users);
        return users;
    }
}
