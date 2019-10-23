package com.sunset.service;

import com.sunset.model.TDynamic;

import java.util.List;

/**
 * @author sunset
 * @date 2019-10-22 13:02
 */
public interface DynamicService {
    //发布动态
    void addDynamic (TDynamic dynamic);
    //查看动态
    List<TDynamic> selectDynamic(Integer id);
    //删除自己动态
    void deleteByIdDynamic(Integer did);
}
