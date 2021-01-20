package com.hjj.springdemo.controller;


import com.hjj.springdemo.enums.ResultEnum;
import com.hjj.springdemo.from.user.AddUserForm;
import com.hjj.springdemo.from.user.ListUserForm;
import com.hjj.springdemo.service.IUsersService;
import com.hjj.springdemo.utils.ResultVoUtil;
import com.hjj.springdemo.vo.ResultVo;
import com.hjj.springdemo.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hjj
 * @since 2021-01-09
 */
@RestController
@RequestMapping("/users")
@Api(tags = "用户")
public class UsersController {
    @Autowired
    private IUsersService usersService;
    /**
     * 添加用户
     * @param userForm 表单数据
     * @return 成功或者失败
     */
    @ApiOperation("添加用户")
    @PostMapping("/addUser")
    public ResultVo addUser(@Validated @RequestBody AddUserForm userForm){
        if(usersService.addUser(userForm)){
            return ResultVoUtil.success();
        }else{
            return ResultVoUtil.error(ResultEnum.ADD_ERROR);
        }
    }

    /**
     * 获取用户列表
     * @param listUserForm 表单数据
     * @return 用户列表
     */
    @ApiOperation("获取用户列表")
    @GetMapping("/listUser")
    @ApiResponses(
            @ApiResponse(code = 200, message = "操作成功", response = UserVo.class)
    )
    public ResultVo listUser(@Validated ListUserForm listUserForm){
        return ResultVoUtil.success(usersService.listUser(listUserForm));
    }

    /**
     * 删除用户
     * @param id 用户编号
     * @return 成功或者失败
     */
    @ApiOperation("删除用户")
    @DeleteMapping("/deleteUser/{id}")
    public ResultVo deleteUser(@PathVariable("id") String id){
        usersService.deleteUser(id);
        return ResultVoUtil.success();
    }

}
