package com.example.cocktailnotes.infra.repo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cocktailnotes.infra.entity.UserDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaoying
 * @create 2024/2/27 23:37
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDo> {

}
