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
public class CocktailNoteEntity {

    /**
     * 自增id
     */
    private Long id;

    /**
     * 笔记名称
     */
    private String name;

    /**
     * 英文名称
     */
    private String enName;

    /**
     * 技法
     */
    private String skill;

    /**
     * 简介
     */
    private String brief;

    /**
     * 基酒类型（枚举code）
     */
    private String baseType;

    /**
     * 风味类型（枚举code）
     */
    private String tasteType;

    /**
     * 来源类型（外键id关联）
     */
    private String sourceType;

    /**
     * 材料列表
     */
    private String materialIdList;

    /**
     * 图片列表
     */
    private String imageIdList;

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
