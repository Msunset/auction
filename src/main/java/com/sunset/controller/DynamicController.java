package com.sunset.controller;

import com.sunset.Mentity.Result;
import com.sunset.model.TDynamic;
import com.sunset.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunset
 * @date 2019-10-22 13:08
 */
@RestController
@RequestMapping("/Dynamic")
public class DynamicController {
    @Autowired
    private DynamicService dynamicService;
    @RequestMapping(value = "/addDynamic",method = RequestMethod.POST)
    public Result addDynamic(@RequestBody TDynamic dynamic){
        return null;

    }
}
