package com.example.cocktailnotes.utils;

import com.example.cocktailnotes.common.CommonResult;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xiaoying
 * @create 2022-05-12 下午 8:35
 */
@Component
public class UploadUtils {

    @Resource
    private SnowflakeIdUtils snowflakeIdUtils;


    /**
     * 上传图片方法类
     * @param multipartFiles
     * @return
     */
    public List<String> uploadFile(List<MultipartFile> multipartFiles) throws Exception {
        List<String> pathList = new ArrayList<>();

        String uploadFilePath = "/data/cocktailNotes/image";
        String filePath = "";

        try {
            for(MultipartFile multipartFile : multipartFiles){
                String newName = snowflakeIdUtils.nextId() + ".jpg";
                File file = new File(uploadFilePath, newName);
                multipartFile.transferTo(file);
                filePath = "http://119.91.63.137:9000/cocktailNotes/"  + newName;
                pathList.add(filePath);
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
        return pathList;
    }

}
