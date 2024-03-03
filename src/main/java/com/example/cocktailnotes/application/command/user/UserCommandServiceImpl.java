package com.example.cocktailnotes.application.command.user;

import com.example.cocktailnotes.application.convert.UserServiceConvert;
import com.example.cocktailnotes.domain.entity.UserEntity;
import com.example.cocktailnotes.domain.service.UserDomainService;
import com.example.cocktailnotes.application.entity.req.user.UserRegisterReq;
import com.example.cocktailnotes.utils.SnowflakeIdUtils;
import com.example.cocktailnotes.utils.UploadUtils;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author xiaoying
 * @create 2024/3/1 00:26
 */
@Service
public class UserCommandServiceImpl implements UserCommandService{

    @Resource
    private UserDomainService userDomainService;

    @Resource
    private SnowflakeIdUtils snowflakeIdUtils;

    @Resource
    private UploadUtils uploadUtils;

    @Resource
    private UserServiceConvert userServiceConvert;

    @Override
    public void register(UserRegisterReq userRegisterReq) throws Exception {
        List<String> imageUrl = new ArrayList<>();
        if(Objects.nonNull(userRegisterReq.getImage())){
            imageUrl = uploadUtils.uploadFile(Lists.newArrayList(userRegisterReq.getImage()));
        }
        if(!CollectionUtils.isEmpty(imageUrl)){
            userRegisterReq.setImageUrl(imageUrl.get(0));
        }
        UserEntity userEntity = userServiceConvert.convert(userRegisterReq);
        userEntity.setId(snowflakeIdUtils.nextId());
        userDomainService.insertOne(userEntity);
    }
}
