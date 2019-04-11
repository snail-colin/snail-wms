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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @author colin
 * 2019/1/28
 */
@RestController()
@RequestMapping("/api/sys")
public class UserController extends BaseController {

    @Autowired
    ISysUserService sysUserService;

    private DiscoveryClient discoveryClient;

    /**
     * 获取用户列表
     * @param request
     * @return
     */
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
    @DeleteMapping("/user/{id}")
    public Result<String> delUser(@PathVariable Integer id) {
        return sysUserService.delUser(id);
    }

    @GetMapping("/test")
    public String test(){
        return sysUserService.test();
    }

}
