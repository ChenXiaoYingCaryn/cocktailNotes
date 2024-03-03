package com.example.cocktailnotes.application.command.user;

import com.example.cocktailnotes.application.entity.req.user.UserRegisterReq;

/**
 * @author xiaoying
 * @create 2024/3/1 00:26
 */
public interface UserCommandService {

    /**
     * 用户注册
     * @param userRegisterReq
     */
    void register(UserRegisterReq userRegisterReq) throws Exception;

}
