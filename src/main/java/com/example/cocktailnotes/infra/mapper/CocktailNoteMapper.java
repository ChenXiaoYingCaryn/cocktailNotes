package com.example.cocktailnotes.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cocktailnotes.infra.entity.CocktailNoteDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaoying
 * @create 2024/3/5 00:16
 */
@Mapper
public interface CocktailNoteMapper extends BaseMapper<CocktailNoteDo> {

}
