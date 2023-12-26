package com.sora.springbootmall.dao;

import com.sora.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
