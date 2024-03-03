package com.example.cocktailnotes.application.entity.req.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoying
 * @create 2024/3/3 23:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryUserInfoReq {

    @ApiModelProperty(name = "微信号")
    private String wechatId;

}
