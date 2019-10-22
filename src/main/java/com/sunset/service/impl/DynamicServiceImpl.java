package com.sunset.service.impl;

import com.sunset.dao.TDynamicMapper;
import com.sunset.model.TDynamic;
import com.sunset.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
