package com.hjj.springdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @program: SpringBootDemo
 * @description:
 * @author: hjj
 * @create: 2020-10-18 21:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotNull(message = "Id 不能为空")
    private String Id;

    @Size(max = 10)
    @NotNull(message = "name 不能为空")
    private String name;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))", message = "sex 值不在可选范围")
    @NotNull(message = "sex 不能为空")
    private String sex;

    @Email(message = "email 格式不正确")
    @NotNull(message = "email 不能为空")
    private String email;
}
