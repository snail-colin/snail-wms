package com.snail.service;

import com.github.pagehelper.PageInfo;
import com.snail.common.PageRequest;
import com.snail.common.Result;
import com.snail.entity.SysUser;
import com.snail.pojo.SysUserCreateRequest;
import com.snail.pojo.SysUserGetRequest;
import com.snail.pojo.SysUserUpdateRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ISysUserService {

    /**
     * 获取用户列表
     */
    PageInfo<SysUser> getUserList(PageRequest<SysUserGetRequest> page);

    /**
     * 创建用户
     */
    Result<String> createUser(SysUserCreateRequest user);

    /**
     * 更新用户
     */
    Result<String> updateUser(SysUserUpdateRequest user);


    /**
     * 删除用户
     */
    Result<String> delUser(Integer id);

    String test();
}
