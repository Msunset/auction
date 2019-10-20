package com.sunset.controller;

import com.sunset.Mentity.Result;
import com.sunset.Mentity.StateCode;
import com.sunset.model.TRelation;
import com.sunset.service.RecordService;
import com.sunset.service.RelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author sunset
 * @date 2019-10-19 12:40
 */
@RestController
@RequestMapping("/relation")
@Api(description = "好友功能接口")
public class RelationController {
    @Autowired
    private RelationService relationService;

    /**
     *
     * @param idA 加好友用户
     * @param idB 被添加用户
     * @return
     */
    @ApiOperation(value = "添加好友")
    @RequestMapping(value = "/addFriend/{idA}/{idB}",method = RequestMethod.GET)
    public Result addFriend(@PathVariable Integer idA, @PathVariable Integer idB){

        try {
            int i = relationService.addFriend(idA, idB);
            if (i ==1 ){
                return new Result(true,"添加成功",StateCode.OK);

            }else {
                return new Result(false,"重复添加",StateCode.ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"未知错误",StateCode.ERROR);

        }
    }

    /**
     *
     * @param id 当前登录用户id
     * @return
     */
    @ApiOperation(value = "获取好友列表")
    @RequestMapping(value = "/findByUserFriend/{id}",method = RequestMethod.GET)
    public Result findByUserFriend(@PathVariable Integer id){
        try {
            List<TRelation> byUserId = relationService.findByUserId(id);
            return new Result(true,"查询成功",StateCode.OK,byUserId);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"未知错误",StateCode.ERROR);
        }
    }

    /**
     *
     * @param idA 当前登录id
     * @param idB 要删除好友的id
     * @return
     */
    @ApiOperation(value = "删除好友")
    @RequestMapping(value = "/deleteById/{idA}/{idB}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable Integer idA,@PathVariable Integer idB){
        try {
            relationService.deleteById(idA,idB);
            return new Result(true,"删除成功",StateCode.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"未知错误",StateCode.ERROR);

        }

    }


}
