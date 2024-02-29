package com.example.cocktailnotes;

import com.example.cocktailnotes.utils.SnowflakeIdUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class CocktailNotesApplicationTests {

    @Resource
    private SnowflakeIdUtils snowflakeIdUtils;

    @Test
    void contextLoads() {
        long id = snowflakeIdUtils.nextId();
        System.out.println(id);
    }

}
