package com.example.cocktailnotes.controller;

import com.example.cocktailnotes.application.command.user.UserCommandService;
import com.example.cocktailnotes.application.entity.req.user.QueryUserInfoReq;
import com.example.cocktailnotes.application.entity.resp.user.UserInfoResp;
import com.example.cocktailnotes.application.query.user.UserQueryService;
import com.example.cocktailnotes.common.CommonResult;
import com.example.cocktailnotes.application.entity.req.user.UserRegisterReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiaoying
 * @create 2024/2/28 00:07
 */
@RestController
@RequestMapping("/cocktailNotes")
public class UserController {

    @Resource
    private UserCommandService userCommandService;

    @Resource
    private UserQueryService userQueryService;

    @PostMapping("/register")
    @ApiModelProperty(name = "用户注册")
    public CommonResult<Void> register(UserRegisterReq userRegisterReq) throws Exception {
        userCommandService.register(userRegisterReq);
        return CommonResult.success();
    }

    @PostMapping("/queryUserInfo")
    @ApiModelProperty(name = "根据微信id查询用户信息")
    public CommonResult<UserInfoResp> queryUserInfo(@Validated @RequestBody QueryUserInfoReq req){
        return CommonResult.success(userQueryService.queryUserInfo(req));
    }




}
