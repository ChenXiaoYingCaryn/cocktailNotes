package com.example.cocktailnotes.infra.repo;

import com.example.cocktailnotes.infra.mapper.MaterialMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author xiaoying
 * @create 2024/3/5 00:23
 */
@Repository
public class MaterialRepository {

    @Resource
    private MaterialMapper materialMapper;

}
