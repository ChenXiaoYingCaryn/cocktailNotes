package com.example.cocktailnotes.application.convert;

import com.example.cocktailnotes.application.entity.req.source.SourceInsertReq;
import com.example.cocktailnotes.application.entity.req.source.SourceUpdateReq;
import com.example.cocktailnotes.application.entity.resp.common.DropDownBoxResp;
import com.example.cocktailnotes.domain.entity.SourceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValueMappingStrategy.RETURN_NULL;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

/**
 * @author xiaoying
 * @create 2024/3/8 23:58
 */

@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = ALWAYS,
        nullValueMappingStrategy = RETURN_NULL,
        nullValuePropertyMappingStrategy = IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface SourceServiceConvert {

    SourceServiceConvert INSTANCE = Mappers.getMapper(SourceServiceConvert.class);

    default List<DropDownBoxResp> convert(List<SourceEntity> sourceEntityList){
        List<DropDownBoxResp> res = new ArrayList<>();
        for(SourceEntity entity : sourceEntityList){
            DropDownBoxResp box = new DropDownBoxResp();
            box.setValue(entity.getCode());
            box.setDesc(entity.getName());
            res.add(box);
        }
        return res;
    }

    List<SourceEntity> convert2Entities(List<SourceInsertReq> reqs);

    @Mapping(source = "wechatId", target = "createBy")
    @Mapping(source = "wechatId", target = "updateBy")
    SourceEntity convert(SourceInsertReq req);

    @Mapping(source = "wechatId", target = "updateBy")
    SourceEntity convert(SourceUpdateReq req);

}
