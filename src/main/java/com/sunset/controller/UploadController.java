package com.sunset.controller;

import com.sunset.Mentity.Result;
import com.sunset.Mentity.StateCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
@Api(description = "文件上传")
@RestController
@RequestMapping("/upload")
public class UploadController {
    @ApiOperation("上传图片")
    @RequestMapping(value = "/uploadPhoto",method = RequestMethod.POST,headers = "content-type=multipart/form-data")
    public Result uploadPhoto(MultipartFile file) {
        try {
            String filePath = "E:\\upload";
            //获取文件拓展名
            String filename = file.getOriginalFilename();
            //新的文件按名
            String newFileName = UUID.randomUUID()+filename;
            File targetFile = new File(filePath, newFileName);
            file.transferTo(targetFile);
            String reality = filePath+"\\"+newFileName;
            return new Result(true,"上传成功", StateCode.OK,reality);
        } catch (IOException e) {
            e.printStackTrace();
            return new Result(true,"上传失败", StateCode.OK);
        }

    }
}
