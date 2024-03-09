package com.example.cocktailnotes.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cocktailnotes.infra.entity.MaterialDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaoying
 * @create 2024/3/5 00:14
 */
@Mapper
public interface MaterialMapper extends BaseMapper<MaterialDo> {

}
