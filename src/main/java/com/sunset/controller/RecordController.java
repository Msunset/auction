package com.sunset.controller;

import com.sunset.Mentity.Result;
import com.sunset.Mentity.StateCode;
import com.sunset.model.TProduct;
import com.sunset.service.RecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author sunset
 * @date 2019-10-19 02:54
 */
@RestController
@RequestMapping("/record")
@Api(description = "产品竞拍接口")
public class RecordController {
    @Autowired
    private RecordService recordService;
    //通过商品id查询商品拍卖纪录
    @ApiOperation(value = "查询某个商品的拍卖纪录")
    @RequestMapping(value = "/findByIdRecord/{pid}",method = RequestMethod.GET)
    public Result findByIdRecord(@PathVariable Integer pid){
        try {
            return new Result(true,"查询成功", StateCode.OK,recordService.findByIdRecord(pid));
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"未知错误",StateCode.ERROR);

        }
    }
    //增加竞拍纪录
    @ApiOperation(value = "增加拍卖商品的纪录")
    @RequestMapping(value = "/addRecord/{id}/{price}",method = RequestMethod.POST)
    public Result addRecord(@PathVariable String id,@PathVariable double price, @RequestBody TProduct product){
        try {
            recordService.insertRecord(id,price,product);
            return new Result(true,"竞价成功",StateCode.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"未知错误",StateCode.ERROR);
        }

    }
}
