package com.snail.service;

import com.snail.common.PageRequest;
import com.snail.common.Result;
import com.snail.entity.SysUser;
import com.snail.feign.FeignClientConfig;
import com.snail.pojo.SysUserCreateRequest;
import com.snail.pojo.SysUserGetRequest;
import com.snail.pojo.SysUserUpdateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * TODO  返回类型设计有问题
 */
@FeignClient(name = "PROVIDER-PRODUCT", configuration = FeignClientConfig.class)
public interface ISysUserService {

    /**
     * 创建用户
     */
    @PostMapping("/api/sys/user")
    Result<String> createUser(SysUserCreateRequest user);

    /**
     * 更新用户
     */
    @PutMapping("/api/sys/user/{id}")
    Result<String> updateUser(SysUserUpdateRequest user);


    /**
     * 删除用户
     */
    @DeleteMapping("/api/sys/user/{id}")
    Result<String> delUser(Integer id);


    @RequestMapping(value = "/api/sys/test",method = RequestMethod.GET)
    String test();
}
