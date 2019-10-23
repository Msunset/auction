package com.sunset.service.impl;

import com.sunset.dao.TDynamicMapper;
import com.sunset.model.TDynamic;
import com.sunset.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author sunset
 * @date 2019-10-22 13:01
 */
@Service
public class DynamicServiceImpl implements DynamicService {
    @Autowired
    private TDynamicMapper dynamicMapper;
    @Override
    public void addDynamic(TDynamic dynamic)  {
        dynamicMapper.insert(dynamic);
    }
    //根据id查看好友动态
    @Override
    public List<TDynamic> selectDynamic(Integer id) {
        Example example = new Example(TDynamic.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("uid",id);
        return dynamicMapper.selectByExample(example);

    }

    //根据did删除动态
    public void deleteByIdDynamic(Integer did){
        dynamicMapper.deleteByPrimaryKey(did);
    }
}
