package com.sunset.dao;

import com.sunset.model.TUser;

import java.util.List;

import com.sunset.model.TUserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface TUserMapper extends Mapper<TUser> {
//    long countByExample(TUserExample example);
//
//    int deleteByExample(TUserExample example);
//
//    int insert(TUser record);
//
//    int insertSelective(TUser record);
//
//    List<TUser> selectByExample(TUserExample example);
//
//    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);
//
//    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);
}