package com.sunset.service.impl;

import com.sunset.dao.TProductMapper;
import com.sunset.model.TProduct;
import com.sunset.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * @author sunset
 * @date 2019-10-19 00:02
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private TProductMapper tproductMapper;
    //查询所有
    @Override
    public List<TProduct> findAll() {
        return tproductMapper.selectAll();
    }
    //根据id查询
    @Override
    public TProduct findById(Integer id) {
        TProduct tProduct = tproductMapper.selectByPrimaryKey(id);
        return tProduct;
    }
    //根据商品名称模糊查询

    @Override
    public List<TProduct> findByProductName(String name) {
        Example example = new Example(TProduct.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("productname","%"+name+"%");
        List<TProduct> productList = tproductMapper.selectByExample(example);
        return productList;
    }

    @Override
    public void addProduct(TProduct product) {
        product.setCreattime(new Date());
        product.setState(1);
        tproductMapper.insert(product);
    }
}
