package com.example.cocktailnotes.domain.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValueMappingStrategy.RETURN_NULL;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

/**
 * @author xiaoying
 * @create 2024/3/5 00:28
 */
@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = ALWAYS,
        nullValueMappingStrategy = RETURN_NULL,
        nullValuePropertyMappingStrategy = IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CocktailNoteDomainConvert {
}
