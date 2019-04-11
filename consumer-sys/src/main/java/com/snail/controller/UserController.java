package com.snail.controller;


import com.snail.pojo.SysUserGetRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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


    public static final String PRODUCT_GET_URL = "http://localhost:8080/api/sys/users/";
    public static final String PRODUCT_LIST_URL="http://localhost:8080/api/sys/user/";



    @Resource
    private RestTemplate restTemplate;


    @Resource
    private HttpHeaders httpHeaders;

    /**
     * 获取用户列表
     * @param request
     * @return
     */
    @ApiOperation(value = "获取用户列表接口", produces = "application/json")
    @GetMapping("/users")
    public Object getUsers(SysUserGetRequest request) {
        System.out.println(1);
      Object  page =  restTemplate.exchange(PRODUCT_GET_URL, HttpMethod.GET,new HttpEntity<Object>(httpHeaders), Object.class).getBody();
      return page;
    }

}
