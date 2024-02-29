package com.example.cocktailnotes.application.entity.req.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xiaoying
 * @create 2024/2/28 00:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterReq {

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 微信号
     */
    private String wechatId;

    /**
     * 头像
     */
    private MultipartFile image;

    /**
     * 头像链接
     */
    private String imageUrl;

}
