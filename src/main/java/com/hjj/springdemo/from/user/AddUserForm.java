package com.hjj.springdemo.from.user;

import com.hjj.springdemo.entity.Users;
import com.hjj.springdemo.from.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @program: springdemo
 * @description: 添加用户需要的表单数据
 * @author: hjj
 * @create: 2020-10-24 18:23
 **/
@Data
@ApiModel("添加用户需要的表单数据")
@EqualsAndHashCode(callSuper = false)
public class AddUserForm extends BaseForm<Users> {

    /**
     * 昵称
     */
    @ApiModelProperty("昵称")
    @NotEmpty(message = "昵称不能为为空")
    @Length(min = 1 , max = 10 , message = "昵称长度限制为1~10")
    private String nickname;

    /**
     * 生日
     */
    @ApiModelProperty("生日")
    @Past(message = "生日时间必须小于当前时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 1 , max = 16 , message = "用户名长度限制为1~16")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    @NotEmpty(message = "密码不能为空")
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[._~!@#$^&*])[A-Za-z0-9._~!@#$^&*]{8,20}$" , message = "密码不符合规范")
    private String password;

    /**
     * 构造实体
     * @return 实体对象
     */
    @Override
    public Users buildEntity() {
        Users user = new Users();
        BeanUtils.copyProperties(this,user);
        return user;
    }
}
