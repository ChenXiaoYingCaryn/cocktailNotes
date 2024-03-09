package com.example.cocktailnotes.infra.repo;

import com.example.cocktailnotes.infra.mapper.CocktailNoteMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author xiaoying
 * @create 2024/3/5 00:22
 */
@Repository
public class CocktailNoteRepository {

    @Resource
    private CocktailNoteMapper cocktailNoteMapper;


}
