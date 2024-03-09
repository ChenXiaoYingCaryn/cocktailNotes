package com.example.cocktailnotes.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author xiaoying
 * @create 2024/3/5 00:21
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourceEntity {

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 来源名称
     */
    private String name;

    /**
     * 来源code
     */
    private String code;

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
