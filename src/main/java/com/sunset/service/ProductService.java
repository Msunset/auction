package com.sunset.service;

import com.sunset.model.TProduct;

import java.util.List;

/**
 * @author sunset
 * @date 2019-10-19 00:00
 */
public interface ProductService {
    List<TProduct> findAll();
    TProduct findById(Integer id);
    void addProduct(TProduct product);
    List<TProduct> findByProductName(String name);


}
