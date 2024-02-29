package com.example.cocktailnotes.domain.convert;

import com.example.cocktailnotes.domain.entity.UserEntity;
import com.example.cocktailnotes.infra.entity.UserDo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValueMappingStrategy.RETURN_NULL;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

/**
 * @author xiaoying
 * @create 2024/3/1 00:41
 */

@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = ALWAYS,
        nullValueMappingStrategy = RETURN_NULL,
        nullValuePropertyMappingStrategy = IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserDomainConvert {

    UserDomainConvert INSTANCE = Mappers.getMapper(UserDomainConvert.class);

    UserDo convert(UserEntity entity);


}
