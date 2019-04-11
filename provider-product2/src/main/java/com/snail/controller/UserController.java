package com.snail.controller;

import com.github.pagehelper.PageInfo;
import com.snail.common.BaseException;
import com.snail.common.PageRequest;
import com.snail.common.Result;
import com.snail.common.ResultType;
import com.snail.entity.SysUser;
import com.snail.pojo.SysUserCreateRequest;
import com.snail.pojo.SysUserGetRequest;
import com.snail.pojo.SysUserUpdateRequest;
import com.snail.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @author colin
 * 2019/1/28
 */
@Api(value = "用户管理信息", tags = "用户管理信息")
@RestController()
@RequestMapping("/api/sys")
public class UserController extends BaseController {

    @Autowired
    ISysUserService sysUserService;


    /**
     * 获取用户列表
     * @param request
     * @return
     */
    @ApiOperation(value = "获取用户列表接口", produces = "application/json")
    @GetMapping("/users")
    public PageInfo<SysUser> getUsers(SysUserGetRequest request) {
        PageRequest<SysUserGetRequest> page = new PageRequest<>(request.getPageNum(), request.getPageSize(), request);
        return sysUserService.getUserList(page);
    }

    /**
     * 创建用户
     *
     * @param user
     */
    @ApiOperation(value = "创建用户", produces = "application/json")
//    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = "application/json")
    @PostMapping("/user")
    public Result<String> createUser(@RequestBody SysUserCreateRequest user) {
        try {
            checkRequest(user);
        } catch (BaseException e) {
            return new Result<>(ResultType.error, e.getCode(), e.getMsg());
        }
        return sysUserService.createUser(user);
    }


    /**
     * 更新用户
     * @param user
     * @return
     */
    @ApiOperation(value = "更新用户", produces = "application/json")
    @PutMapping("/user/{id}")
    public Result<String> updateUser(@PathVariable Integer id,@RequestBody SysUserUpdateRequest user) {
        try {
            checkRequest(user);
            user.setId(id);
        } catch (BaseException e) {
            return new Result<>(ResultType.error, e.getCode(), e.getMsg());
        }
        return sysUserService.updateUser(user);
    }


    /**
     * 删除用户
     * @param id
     * @return
     */
    @ApiOperation(value = "删除用户", produces = "application/json")
    @DeleteMapping("/user/{id}")
    public Result<String> delUser(@PathVariable Integer id) {
        System.out.println("测试一下22");
        System.out.println("测试一下332");
        return sysUserService.delUser(id);
    }

}
