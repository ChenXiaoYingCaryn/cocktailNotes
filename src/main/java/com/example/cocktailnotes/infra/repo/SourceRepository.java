package com.example.cocktailnotes.infra.repo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.cocktailnotes.domain.entity.SourceEntity;
import com.example.cocktailnotes.infra.convert.SourceRepoConvert;
import com.example.cocktailnotes.infra.entity.SourceDo;
import com.example.cocktailnotes.infra.mapper.SourceMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/5 00:24
 */

@Repository
public class SourceRepository {

    @Resource
    private SourceMapper sourceMapper;

    @Resource
    private SourceRepoConvert sourceRepoConvert;

    /**
     * 批量插入
     *
     * @param entityList
     */
    public void insertBatchSomeColumn(List<SourceEntity> entityList){
        for (SourceEntity entity : entityList){
            sourceMapper.insert(sourceRepoConvert.covert(entity));
        }
    }

    /**
     * 插入单条
     *
     * @param entity
     */
    public void insertOne(SourceEntity entity){
        sourceMapper.insert(sourceRepoConvert.covert(entity));
    }

    /**
     * 根据id更新
     *
     * @param entity
     */
    public void updateById(SourceEntity entity){
        SourceDo sourceDo =  sourceRepoConvert.covert(entity);
        LambdaUpdateWrapper<SourceDo> lambdaUpdateWrapper = Wrappers.lambdaUpdate();
        lambdaUpdateWrapper.eq(SourceDo::getId, entity.getId()).
                set(Strings.isNotEmpty(entity.getCode()), SourceDo::getCode, entity.getCode()).
                set(Strings.isNotEmpty(entity.getName()),SourceDo::getName, entity.getName()).
                set(Strings.isNotEmpty(entity.getUpdateBy()), SourceDo::getUpdateBy, entity.getUpdateBy());
        sourceMapper.update(null, lambdaUpdateWrapper);
    }

    /**
     * 查询所有可用信息源
     *
     * @return
     */
    public List<SourceEntity> queryEnableSourceList(){
        QueryWrapper<SourceDo> wrapper = Wrappers.query();
        wrapper.eq("is_deleted", 0);
        return sourceRepoConvert.convert2SourceEntityList(sourceMapper.selectList(wrapper));
    }

    /**
     * 批量删除信息源
     *
     * @param idList
     */
    public void delete(List<Long> idList, String wechatId){
        LambdaUpdateWrapper<SourceDo> lambdaUpdateWrapper = Wrappers.lambdaUpdate();
        lambdaUpdateWrapper.in(SourceDo::getId, idList).
                set(SourceDo::getIsDeleted, 1).
                set(SourceDo::getUpdateBy, wechatId);
        sourceMapper.update(null, lambdaUpdateWrapper);
    }

}
