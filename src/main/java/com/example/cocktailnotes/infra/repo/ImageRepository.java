package com.example.cocktailnotes.infra.repo;

import com.example.cocktailnotes.infra.mapper.ImageMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author xiaoying
 * @create 2024/3/5 00:23
 */
@Repository
public class ImageRepository {

    @Resource
    private ImageMapper imageMapper;
}
