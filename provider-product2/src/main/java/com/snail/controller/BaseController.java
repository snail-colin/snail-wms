package com.snail.controller;

import com.snail.common.BaseException;
import com.snail.common.CheckUtil;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author colin
 * 2019/1/30
 */
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "请求正常完成"),
        @ApiResponse(code = 400, message = "请求中有语法问题，或不能满足请求"),
        @ApiResponse(code = 500, message = "服务器出现异常")}
)
public class BaseController {

    protected void checkRequest(Object obj) throws BaseException {
        CheckUtil.checkRequest(obj);
    }
}
