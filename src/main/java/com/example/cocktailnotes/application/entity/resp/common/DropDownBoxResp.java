package com.example.cocktailnotes.application.entity.resp.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoying
 * @create 2024/3/8 00:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DropDownBoxResp {

    /**
     * 传给后端的值
     */
    private String value;

    /**
     * 前端展示的值
     */
    private String desc;

}
