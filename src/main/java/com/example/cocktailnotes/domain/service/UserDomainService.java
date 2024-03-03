package com.example.cocktailnotes.domain.service;

import com.example.cocktailnotes.domain.convert.UserDomainConvert;
import com.example.cocktailnotes.domain.entity.UserEntity;
import com.example.cocktailnotes.infra.repo.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiaoying
 * @create 2024/3/1 00:32
 */
@Service
public class UserDomainService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserDomainConvert userDomainConvert;

    /**
     * 新增用户信息
     *
     * @param entity
     */
    public void insertOne(UserEntity entity){
        userRepository.insert(entity);
    }

    /**
     * 根据微信id查询用户信息
     *
     * @param wechatId
     * @return
     */
    public UserEntity queryUserInfo(String wechatId){
        return userRepository.queryByWechatId(wechatId);
    }

}
