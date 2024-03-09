package com.example.cocktailnotes.application.command.source;

import com.example.cocktailnotes.application.convert.SourceServiceConvert;
import com.example.cocktailnotes.application.entity.req.source.SourceDeleteReq;
import com.example.cocktailnotes.application.entity.req.source.SourceInsertReq;
import com.example.cocktailnotes.application.entity.req.source.SourceUpdateReq;
import com.example.cocktailnotes.domain.entity.SourceEntity;
import com.example.cocktailnotes.domain.service.SourceDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/9 00:27
 */
@Service
public class SourceCommandServiceImpl implements SourceCommandService{

    @Resource
    private SourceDomainService sourceDomainService;

    @Resource
    private SourceServiceConvert sourceServiceConvert;

    @Override
    public void batchInsert(List<SourceInsertReq> sourceInsertReqList) {
        List<SourceEntity> sourceEntityList = sourceServiceConvert.convert2Entities(sourceInsertReqList);
        sourceDomainService.batchInsert(sourceEntityList);
    }

    @Override
    public void insertOne(SourceInsertReq req) {
        SourceEntity entity = sourceServiceConvert.convert(req);
        sourceDomainService.insertOne(entity);
    }

    @Override
    public void updateOne(SourceUpdateReq req) {
        SourceEntity entity = sourceServiceConvert.convert(req);
        sourceDomainService.updateById(entity);
    }

    @Override
    public void batchDelete(SourceDeleteReq req) {
        sourceDomainService.delete(req.getIdList(), req.getWechatId());
    }
}
