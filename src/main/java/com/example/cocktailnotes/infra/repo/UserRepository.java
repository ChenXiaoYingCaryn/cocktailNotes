package com.example.cocktailnotes.infra.repo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.cocktailnotes.domain.entity.UserEntity;
import com.example.cocktailnotes.infra.convert.UserRepoConvert;
import com.example.cocktailnotes.infra.mapper.UserMapper;
import com.example.cocktailnotes.infra.entity.UserDo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author xiaoying
 * @create 2024/3/3 23:20
 */
@Repository
public class UserRepository {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserRepoConvert userRepoConvert;

    public void insert(UserEntity entity){
        userMapper.insert(userRepoConvert.convert(entity));
    }

    public UserEntity queryByWechatId(String wechatId){
        QueryWrapper<UserDo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("wechat_id", wechatId);
        return userRepoConvert.convert(userMapper.selectOne(queryWrapper));
    }


}
