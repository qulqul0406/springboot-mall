package com.sora.springbootmall.dao;

import com.sora.springbootmall.constant.ProductCategory;
import com.sora.springbootmall.dto.ProductQueryParams;
import com.sora.springbootmall.dto.ProductRequest;
import com.sora.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
