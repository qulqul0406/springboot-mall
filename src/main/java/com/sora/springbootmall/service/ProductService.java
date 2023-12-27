package com.sora.springbootmall.service;

import com.sora.springbootmall.dto.ProductQueryParams;
import com.sora.springbootmall.dto.ProductRequest;
import com.sora.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);


    void deleteProduct(Integer productId);
}
