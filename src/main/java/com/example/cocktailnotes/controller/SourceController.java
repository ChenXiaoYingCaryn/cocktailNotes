package com.example.cocktailnotes.controller;

import com.example.cocktailnotes.application.command.source.SourceCommandService;
import com.example.cocktailnotes.application.entity.req.source.SourceDeleteReq;
import com.example.cocktailnotes.application.entity.req.source.SourceInsertReq;
import com.example.cocktailnotes.application.entity.req.source.SourceUpdateReq;
import com.example.cocktailnotes.application.entity.resp.common.DropDownBoxResp;
import com.example.cocktailnotes.application.query.source.SourceQueryService;
import com.example.cocktailnotes.common.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/5 00:32
 */
@RestController
@RequestMapping("/source")
public class SourceController {

    @Resource
    private SourceCommandService sourceCommandService;

    @Resource
    private SourceQueryService sourceQueryService;

    @PostMapping("/insertOne")
    public CommonResult<Void> insertOne(@RequestBody SourceInsertReq req){
        sourceCommandService.insertOne(req);
        return CommonResult.success();
    }

    @PostMapping("/batchInsert")
    public CommonResult<Void> batchInsert(@RequestBody List<SourceInsertReq> req){
        sourceCommandService.batchInsert(req);
        return CommonResult.success();
    }

    @PostMapping("/updateOne")
    public CommonResult<Void> updateOne(@RequestBody SourceUpdateReq req){
        sourceCommandService.updateOne(req);
        return CommonResult.success();
    }

    @PostMapping("/deleteOne")
    public CommonResult<Void> deleteOne(@RequestBody SourceDeleteReq req){
        sourceCommandService.batchDelete(req);
        return CommonResult.success();
    }

    @PostMapping("/queryEnableSourceList")
    public CommonResult<List<DropDownBoxResp>> queryEnableSourceList(){
        return CommonResult.success(sourceQueryService.queryEnableSourceList());
    }

}
