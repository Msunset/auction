package com.sunset.service.impl;
import com.sunset.dao.TRelationMapper;
import com.sunset.dao.TUserMapper;
import com.sunset.model.TRelation;
import com.sunset.model.TUser;
import com.sunset.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author sunset
 * @date 2019-10-19 12:26
 */
@Service
public class RelationServiceImpl implements RelationService {
    @Resource
    private TRelationMapper relationMapper;
    @Autowired
    TUserMapper userMapper;

    @Override
    public int addFriend(Integer idA, Integer idB) {
        TUser userA = userMapper.selectByPrimaryKey(idA);
        TUser userB = userMapper.selectByPrimaryKey(idB);
        //如果是好友返回不能重复添加
//        Example example = new Example(TRelation.class);
////        Example.Criteria criteria = example.createCriteria();
////        criteria.andEqualTo("persona",userA.getId());
        TRelation tR1 = new TRelation();
        tR1.setPersona(idA);
        List<TRelation> tRelations1 = relationMapper.select(tR1);
//        Example example2 = new Example(TRelation.class);
//        Example.Criteria criteria2 = example.createCriteria();
//        Integer id = userB.getId();
//        criteria2.andEqualTo("persona",id);
        TRelation tR2 = new TRelation();
        tR2.setPersona(idB);
        List<TRelation> tRelation2 =  relationMapper.select(tR2);
        for (TRelation tRe1 : tRelations1) {
            Integer personb= tRe1.getPersonb();
            //判断是否重复添加
           if (personb == idB){
               return 0;
           }
        }
        //添加好友关系
        TRelation tRelation = new TRelation();
        TRelation tRelation2a = new TRelation();
        tRelation.setPersona(userA.getId());
        tRelation.setPersonb(userB.getId());
        tRelation.setPersonNamea(userA.getUsername());
        tRelation.setPersonNameb(userB.getUsername());
        tRelation.setState(1);
        tRelation.setBirthday(userB.getBirthday());
        tRelation.setSex(userB.getSex());
        tRelation.setCreattime(new Date());
        relationMapper.insertSelective(tRelation);
        tRelation2a.setPersona(userB.getId());
        tRelation2a.setPersonb(userA.getId());
        tRelation2a.setPersonNamea(userB.getUsername());
        tRelation2a.setPersonNameb(userA.getUsername());
        tRelation2a.setState(1);
        tRelation2a.setBirthday(userA.getBirthday());
        tRelation2a.setSex(userA.getSex());
        tRelation2a.setCreattime(new Date());
        relationMapper.insertSelective(tRelation2a);
        return 1;


    }
    //查询好友列表
    @Override
    public List<TRelation> findByUserId(Integer id) {
        Example example = new Example(TRelation.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("persona", id);
        List<TRelation> tRelations = relationMapper.selectByExample(example);
        return tRelations;

    }
    //删除好友
    @Override
    public void deleteById(Integer idA,Integer idB) {

        TRelation tRelation = new TRelation();
        tRelation.setPersona(idA);
        tRelation.setPersonb(idB);
        TRelation tRelation2 = new TRelation();
        tRelation2.setPersona(idB);
        tRelation2.setPersonb(idA);
        //双向删除
        relationMapper.delete(tRelation);
        relationMapper.delete(tRelation2);
    }
}
