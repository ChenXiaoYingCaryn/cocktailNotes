package com.example.cocktailnotes.application.query.user;

import com.example.cocktailnotes.application.entity.req.user.QueryUserInfoReq;
import com.example.cocktailnotes.application.entity.resp.user.UserInfoResp;

/**
 * @author xiaoying
 * @create 2024/3/3 22:58
 */
public interface UserQueryService {

    /**
     * 查询用户信息
     *
     * @param req
     * @return
     */
    UserInfoResp queryUserInfo(QueryUserInfoReq req);

}
