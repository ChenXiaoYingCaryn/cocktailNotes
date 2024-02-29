package com.example.cocktailnotes.controller;

import com.example.cocktailnotes.common.CommonResult;
import com.example.cocktailnotes.utils.UploadUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaoying
 * @create 2024/2/27 00:11
 */
@RestController
@RequestMapping("/cocktailNotes")
public class TestController {

    @Resource
    private UploadUtils uploadUtils;

    @PostMapping("/testUploadUtils")
    public CommonResult<List<String>> testUploadUtils(List<MultipartFile> multipartFile) throws Exception {
        return CommonResult.success(uploadUtils.uploadFile(multipartFile));
    }


}
