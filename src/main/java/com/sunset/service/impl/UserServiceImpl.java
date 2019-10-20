package com.sunset.service.impl;

import com.sunset.dao.TUserMapper;
import com.sunset.model.TRelation;
import com.sunset.model.TUser;
import com.sunset.service.UserService;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author sunset
 * @date 2019-10-18 16:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TUserMapper userMapper;
    @Override
    public List<TUser> findAll() {
        //List<TUser> userList = userMapper.selectByExample(null);
        List<TUser> userList = userMapper.selectAll();
        return userList;

    }

    @Override
    public long login(TUser user) {
        String username = user.getUsername();
        String password = user.getPassword();
        if ("".equals(username) || username==null){
            return 1000; //代表用户名为空
        }
        if ("".equals(password) || password==null){
            return 2000;//代表用户密码为空
        }
            Example example = new Example(TUser.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("username",username);
            System.out.println(example);
            List<TUser> userList = userMapper.selectByExample(example);
            if (userList.size()>0){
                if (username.equals(userList.get(0).getUsername() )&& password.equals(userList.get(0).getPassword())){
                    //登录成功
                    return 3000;
                }
            }
         return 0;

    }

    @Override
    public List<TUser> findByUserName(String username) {
        Example example = new Example(TUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",username);
        return  userMapper.selectByExample(example);
    }

    @Override
    public int addUser(TUser user) {
        user.setCreattime(new Date());
        user.setState(1);//普通用户
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.format(user.getBirthday());
        //判断用户名是否重复
        Example example = new Example(TUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",user.getUsername());
        List<TUser> userList = userMapper.selectByExample(example);
        if (userList.size()==0){
            if (user.getUsername()==null ||"".equals(user.getUsername())){
                return 2;//用户名为空
            }if (user.getPassword() == null ||"".equals(user.getPassword())){
                return 3;//密码为空
            }
            userMapper.insert(user);
            return 1;//代表成功添加
        }else {
            return 0;//用户名重复
        }
    }
}
