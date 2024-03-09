package com.example.cocktailnotes.application.entity.req.source;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoying
 * @create 2024/3/9 00:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourceUpdateReq {

    @ApiModelProperty(value = "信息源id", example = "1")
    private Long id;

    @ApiModelProperty(value = "信息源名称（选填）", example = "书AAA")
    private String name;

    @ApiModelProperty(value = "微信id", example = "cxycxycxy")
    private String wechatId;

}
