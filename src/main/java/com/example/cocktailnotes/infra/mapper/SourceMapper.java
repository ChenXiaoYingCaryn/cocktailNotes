package com.example.cocktailnotes.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cocktailnotes.infra.entity.SourceDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/5 00:15
 */

@Mapper
public interface SourceMapper extends BaseMapper<SourceDo> {

}
