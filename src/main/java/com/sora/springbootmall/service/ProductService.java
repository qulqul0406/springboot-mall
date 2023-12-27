package com.sora.springbootmall.service;

import com.sora.springbootmall.dto.ProductRequest;
import com.sora.springbootmall.model.Product;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);


    void deleteProduct(Integer productId);
}
