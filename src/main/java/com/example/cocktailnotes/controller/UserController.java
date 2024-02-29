package com.example.cocktailnotes.controller;

import com.example.cocktailnotes.application.command.User.UserCommandService;
import com.example.cocktailnotes.common.CommonResult;
import com.example.cocktailnotes.application.entity.req.user.UserRegisterReq;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/register")
    public CommonResult<Void> register(UserRegisterReq userRegisterReq) throws Exception {
        userCommandService.register(userRegisterReq);
        return CommonResult.success();
    }


}
