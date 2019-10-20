package com.sunset.service;

import com.sunset.model.TProduct;
import com.sunset.model.TRecord;

import java.util.List;

/**
 * @author sunset
 * @date 2019-10-19 02:48
 */
public interface RecordService {
    //通过商品id查询商品拍卖纪录
    List<TRecord> findByIdRecord (Integer id);
    //生成竞拍纪录
    void insertRecord(String id, double price ,TProduct product);
}
