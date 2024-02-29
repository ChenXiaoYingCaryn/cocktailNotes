package com.example.cocktailnotes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
@MapperScan("com.example.cocktailnotes.infra.repo")
public class CocktailNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CocktailNotesApplication.class, args);
    }

}
