package com.snail.controller;


import com.snail.common.BaseException;
import com.snail.common.PageRequest;
import com.snail.common.Result;
import com.snail.common.ResultType;
import com.snail.pojo.SysUserCreateRequest;
import com.snail.pojo.SysUserGetRequest;
import com.snail.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;


/**
 * @author colin
 * 2019/1/28
 * TODO 请求参数待优化
 */
@Api(value = "用户管理信息", tags = "用户管理信息")
@RestController()
@RequestMapping("/api/sys")
public class UserController extends BaseController {


    @Resource
    ISysUserService sysUserService;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    /**
     * 创建用户
     *
     * @param user
     */
    @ApiOperation(value = "创建用户", produces = "application/json")
    @PostMapping("/user")
    public Result<String> createUser(@RequestBody SysUserCreateRequest user) {
        try {
            checkRequest(user);
        } catch (BaseException e) {
            return new Result<>(ResultType.error, e.getCode(), e.getMsg());
        }
        return sysUserService.createUser(user);
    }

    @ApiOperation(value = "创建用户")
    @GetMapping("/test")
    public String  test(){
        return  sysUserService.test();
    }

}
