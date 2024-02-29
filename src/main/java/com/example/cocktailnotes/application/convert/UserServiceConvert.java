package com.example.cocktailnotes.application.convert;

import com.example.cocktailnotes.application.entity.req.user.UserRegisterReq;
import com.example.cocktailnotes.domain.entity.UserEntity;
import com.example.cocktailnotes.infra.entity.UserDo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValueMappingStrategy.RETURN_NULL;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

/**
 * @author xiaoying
 * @create 2024/2/28 00:21
 */
@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = ALWAYS,
        nullValueMappingStrategy = RETURN_NULL,
        nullValuePropertyMappingStrategy = IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserServiceConvert {
    UserServiceConvert INSTANCE = Mappers.getMapper(UserServiceConvert.class);

    @Mapping(source = "wechatId", target = "createBy")
    @Mapping(source = "wechatId", target = "updateBy")
    UserEntity convert(UserRegisterReq dto);

}
