package com.snail.controller;

import com.snail.common.Result;
import com.snail.pojo.SysUserCreateRequest;
import com.snail.pojo.SysUserUpdateRequest;
import com.snail.service.ISysUserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author colin
 * 2019/4/10
 * TODO 重构服务提供方接口，使用继承简化服务端的代码，
 * 会导致耦合增强，以后方法新增则服务端、客户端都需要对应修改
 */
@RestController
public class FeginController implements ISysUserService {

    @Override
    public Result<String> createUser(SysUserCreateRequest user) {
        return null;
    }

    @Override
    public Result<String> updateUser(SysUserUpdateRequest user) {
        return null;
    }

    @Override
    public Result<String> delUser(Integer id) {
        return null;
    }

    @Override
    public String test() {
        return null;
    }
}
