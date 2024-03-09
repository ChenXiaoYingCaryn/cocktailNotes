package com.example.cocktailnotes.application.entity.req.source;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoying
 * @create 2024/3/9 00:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourceInsertReq {

    @ApiModelProperty(value = "名称", example = "书AAA")
    private String name;

    @ApiModelProperty(value = "信息源code", example = "BOOK_AAA")
    private String code;

    @ApiModelProperty(value = "用户微信id", example = "cxycxycxy")
    private String wechatId;

}
