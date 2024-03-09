package com.example.cocktailnotes.infra.convert;

import com.example.cocktailnotes.domain.entity.SourceEntity;
import com.example.cocktailnotes.infra.entity.SourceDo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValueMappingStrategy.RETURN_NULL;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

/**
 * @author xiaoying
 * @create 2024/3/8 00:09
 */
@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = ALWAYS,
        nullValueMappingStrategy = RETURN_NULL,
        nullValuePropertyMappingStrategy = IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface SourceRepoConvert {

    SourceRepoConvert INSTANCE = Mappers.getMapper(SourceRepoConvert.class);

    SourceDo covert(SourceEntity entity);

    SourceEntity convert(SourceDo sourceDo);

    List<SourceDo> convert(List<SourceEntity> entityList);

    List<SourceEntity> convert2SourceEntityList (List<SourceDo> doList);
}
