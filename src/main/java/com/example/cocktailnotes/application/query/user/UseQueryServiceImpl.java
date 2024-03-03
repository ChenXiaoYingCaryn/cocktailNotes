package com.example.cocktailnotes.application.query.user;

import com.example.cocktailnotes.application.convert.UserServiceConvert;
import com.example.cocktailnotes.application.entity.req.user.QueryUserInfoReq;
import com.example.cocktailnotes.application.entity.resp.user.UserInfoResp;
import com.example.cocktailnotes.domain.entity.UserEntity;
import com.example.cocktailnotes.domain.service.UserDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiaoying
 * @create 2024/3/3 22:58
 */
@Service
public class UseQueryServiceImpl implements UserQueryService{

    @Resource
    private UserDomainService userDomainService;

    @Resource
    private UserServiceConvert userServiceConvert;

    @Override
    public UserInfoResp queryUserInfo(QueryUserInfoReq req) {
        UserEntity userEntity = userDomainService.queryUserInfo(req.getWechatId());
        return userServiceConvert.convert(userEntity);
    }
}
