package com.sunset.controller;

import com.sunset.Mentity.Result;
import com.sunset.Mentity.StateCode;
import com.sunset.model.TDynamic;
import com.sunset.service.DynamicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunset
 * @date 2019-10-22 13:08
 */
@Api(description = "朋友圈动态")
@RestController
@RequestMapping("/Dynamic")
public class DynamicController {
    @Autowired
    private DynamicService dynamicService;
    @ApiOperation(value = "发布动态")
    @RequestMapping(value = "/addDynamic",method = RequestMethod.POST, headers = "content-type=multipart/form-data")
    public Result addDynamic(@RequestBody TDynamic dynamic){
        try {
            dynamicService.addDynamic(dynamic);
            return new Result(true,"发布成功", StateCode.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"发布失败",StateCode.ERROR);
        }

    }
}
