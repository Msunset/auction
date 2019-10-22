package com.sunset.controller;

import com.sunset.Mentity.Result;
import com.sunset.Mentity.StateCode;
import com.sunset.model.TProduct;
import com.sunset.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sunset
 * @date 2019-10-19 00:05
 */
@RestController
@RequestMapping("/Product")
@Api(description = "商品接口")
public class ProductController {
    @Autowired
    private ProductService productService;

    //查询所有商品
    @ApiOperation("查询所有商品")
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Result findAll(){
        try {
            List<TProduct> productList = productService.findAll();
            return new Result(true,"查询成功", StateCode.OK,productList);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(true,"未知错误", StateCode.OK);
        }
    }
    //根据id查询单个商品
    @ApiOperation(value = "根据id查询单个商品")
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public Result findById( @PathVariable Integer id){
        try {
            TProduct byId = productService.findById(id);
            ArrayList<Object> list = new ArrayList<>();
            list.add(byId);
            return new Result(true,"查询成功",StateCode.OK,list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"未知错误",StateCode.ERROR);
        }
    }
    @ApiOperation(value = "根据商品名称查询")
    @RequestMapping(value = "/findByProductName/{name}",method = RequestMethod.GET)
    public Result findByProductName(@PathVariable String name){
        List<TProduct> tProductList = productService.findByProductName(name);
        return new Result(true,"查询成功",StateCode.OK,tProductList);


    }
    //增加商品
    @ApiOperation(value = "添加商品")
    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public Result addProduct(@RequestBody TProduct product){
        try {
            productService.addProduct(product);
            return new Result(true,"添加成功",StateCode.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"未知错误",StateCode.ERROR);
        }
    }

}
