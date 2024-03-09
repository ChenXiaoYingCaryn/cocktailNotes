package com.example.cocktailnotes.domain.service;

import com.example.cocktailnotes.domain.entity.SourceEntity;
import com.example.cocktailnotes.infra.repo.SourceRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/5 00:25
 */
@Service
public class SourceDomainService {

    @Resource
    private SourceRepository sourceRepository;

    /**
     * 批量插入
     * @param entityList
     */
    public void batchInsert(List<SourceEntity> entityList){
        sourceRepository.insertBatchSomeColumn(entityList);
    }

    /**
     * 批量查询可用信息源
     * @return
     */
    public List<SourceEntity> queryEnableSourceList(){
        return sourceRepository.queryEnableSourceList();
    }

    /**
     * 批量删除
     * @param idList
     * @param wechatId
     */
    public void delete(List<Long> idList, String wechatId){
        sourceRepository.delete(idList, wechatId);
    }

    /**
     * 插入单条
     *
     * @param entity
     */
    public void insertOne(SourceEntity entity){
        sourceRepository.insertOne(entity);
    }

    /**
     * 更新信息源
     *
     * @param entity
     */
    public void updateById(SourceEntity entity){
        sourceRepository.updateById(entity);
    }

}
