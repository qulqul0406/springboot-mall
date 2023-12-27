package com.sora.springbootmall.service;

import com.sora.springbootmall.dto.ProductRequest;
import com.sora.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
