package com.sunset.service;

import com.sunset.model.TRelation;
import com.sunset.model.TUser;

import java.util.List;

/**
 * @author sunset
 * @date 2019-10-19 12:22
 */
public interface RelationService {
    //添加好友
    int addFriend(Integer idA,Integer idB);
    //显示好友列表
    List<TRelation> findByUserId(Integer id);
    //删除好友关系
    void deleteById(Integer idA,Integer idB);
}
