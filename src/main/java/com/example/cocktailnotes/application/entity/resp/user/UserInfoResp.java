package com.example.cocktailnotes.application.entity.resp.user;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoying
 * @create 2024/3/3 23:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoResp {

    @ApiModelProperty(name = "自增id")
    private Long id;

    @ApiModelProperty(name = "微信号")
    private String wechatId;

    @ApiModelProperty(name = "昵称")
    private String nickName;

    @ApiModelProperty(name = "用户头像链接")
    private String imageUrl;


}
