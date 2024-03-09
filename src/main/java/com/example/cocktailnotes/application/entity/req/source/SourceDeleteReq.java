package com.example.cocktailnotes.application.entity.req.source;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xiaoying
 * @create 2024/3/9 00:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourceDeleteReq {

    private List<Long> idList;

    private String wechatId;
}
