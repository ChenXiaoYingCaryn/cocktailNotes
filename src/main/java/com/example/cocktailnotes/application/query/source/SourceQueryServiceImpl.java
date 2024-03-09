package com.example.cocktailnotes.application.query.source;

import com.example.cocktailnotes.application.convert.SourceServiceConvert;
import com.example.cocktailnotes.application.entity.resp.common.DropDownBoxResp;
import com.example.cocktailnotes.domain.entity.SourceEntity;
import com.example.cocktailnotes.domain.service.SourceDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/8 00:53
 */
@Service
public class SourceQueryServiceImpl implements SourceQueryService{

    @Resource
    private SourceDomainService sourceDomainService;

    @Resource
    private SourceServiceConvert sourceServiceConvert;

    @Override
    public List<DropDownBoxResp> queryEnableSourceList() {
        List<SourceEntity> sourceEntities = sourceDomainService.queryEnableSourceList();
        return sourceServiceConvert.convert(sourceEntities);
    }


}
