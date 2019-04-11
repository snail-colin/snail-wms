package com.snail.controller;

import com.snail.common.BaseException;
import com.snail.common.CheckUtil;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author colin
 * 2019/1/30
 */
public class BaseController {

    protected void checkRequest(Object obj) throws BaseException {
        CheckUtil.checkRequest(obj);
    }
}
