package com.sunset.dao;

import com.sunset.model.TRecord;
import java.util.List;

import com.sunset.model.TRecordExample;
import com.sunset.model.TRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface TRecordMapper extends Mapper<TRecord> {
    void insert(TRelation tRelation);
//    long countByExample(TRecordExample example);
//
//    int deleteByExample(TRecordExample example);
//
//    int insert(TRecord record);
//
//    int insertSelective(TRecord record);
//
//    List<TRecord> selectByExample(TRecordExample example);
//
//    int updateByExampleSelective(@Param("record") TRecord record, @Param("example") TRecordExample example);
//
//    int updateByExample(@Param("record") TRecord record, @Param("example") TRecordExample example);
}