package com.example.cocktailnotes.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author xiaoying
 * @create 2024/3/5 00:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageEntity {

    /**
     * 自增id
     */
    private Long id;

    /**
     * 图片url
     */
    private String imageUrl;

    /**
     * 创建人wechatId
     */
    private String createBy;

    /**
     * 更新人wechatId
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
