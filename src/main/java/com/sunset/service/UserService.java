package com.sunset.service;

import com.sunset.model.TUser;

import java.util.List;

/**
 * @author sunset
 * @date 2019-10-18 17:06
 */
public interface UserService {
    List<TUser> findAll();
    //登录功能实现
    long login(TUser user);
    List<TUser> findByUserName(String username);
    //添加用户
    int addUser(TUser user);
}
