package com.example.cocktailnotes.application.query.source;

import com.example.cocktailnotes.application.entity.resp.common.DropDownBoxResp;

import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/8 00:53
 */
public interface SourceQueryService {

    /**
     *  查询所有可用信息源
     *
     * @return
     */
    List<DropDownBoxResp> queryEnableSourceList();

}
