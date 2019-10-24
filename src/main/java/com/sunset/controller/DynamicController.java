package com.sunset.controller;

import com.sunset.Mentity.Result;
import com.sunset.Mentity.StateCode;
import com.sunset.model.TDynamic;
import com.sunset.service.DynamicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author sunset
 * @date 2019-10-22 13:08
 */
@Api(description = "朋友圈动态")
@RestController
@RequestMapping("/dynamic")
public class DynamicController {
    @Autowired
    private DynamicService dynamicService;
    @ApiOperation(value = "发布动态")
    @RequestMapping(value = "/addDynamic",method = RequestMethod.POST)
    public Result addDynamic(@RequestBody TDynamic dynamic){
        System.out.println(dynamic);
        try {
            dynamicService.addDynamic(dynamic);
            return new Result(true,"发布成功", StateCode.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"发布失败",StateCode.ERROR);
        }

    }
    @ApiOperation("查询好朋友动态")
    @RequestMapping(value = "/selectDynamic/{uid}",method = RequestMethod.GET)
    public Result selectDynamic(@PathVariable Integer uid){
        try {
            List<TDynamic> tDynamics = dynamicService.selectDynamic(uid);
            return new Result(true,"查询成功",StateCode.OK,tDynamics);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"查询失败",StateCode.OK);

        }

    }
    @ApiOperation("删除好友动态")
    @RequestMapping(value = "/deleteByIdDynamic/{did}",method = RequestMethod.DELETE)
    public Result deleteByIdDynamic(@PathVariable Integer did){
        try {
            dynamicService.deleteByIdDynamic(did);
            return new Result(true,"删除成功",StateCode.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败",StateCode.OK);
        }
    }


}
