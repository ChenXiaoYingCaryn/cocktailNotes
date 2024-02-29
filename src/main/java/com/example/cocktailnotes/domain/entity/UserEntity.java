package com.example.cocktailnotes.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author xiaoying
 * @create 2024/3/1 00:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    /**
     * 自增id
     */
    private Long id;

    /**
     * 微信号
     */
    private String wechatId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户头像链接
     */
    private String imageUrl;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
