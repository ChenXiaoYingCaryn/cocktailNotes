package com.example.cocktailnotes.application.command.source;

import com.example.cocktailnotes.application.entity.req.source.SourceDeleteReq;
import com.example.cocktailnotes.application.entity.req.source.SourceInsertReq;
import com.example.cocktailnotes.application.entity.req.source.SourceUpdateReq;

import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/9 00:09
 */
public interface SourceCommandService {

    /**
     * 批量更新
     * @param sourceInsertReqList
     */
    void batchInsert(List<SourceInsertReq> sourceInsertReqList);

    /**
     * 单条插入
     * @param req
     */
    void insertOne(SourceInsertReq req);

    /**
     * 更新信息源名称
     * @param req
     */
    void updateOne(SourceUpdateReq req);

    /**
     * 删除信息源
     * @param req
     */
    void batchDelete(SourceDeleteReq req);

}
