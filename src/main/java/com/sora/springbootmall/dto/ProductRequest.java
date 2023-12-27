package com.sora.springbootmall.dto;

import com.sora.springbootmall.constant.ProductCategory;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ProductRequest {

    @NotNull
    private String productName;
    @NotNull
    private ProductCategory category;
    @NotNull
    private String imageUrl;
    @NotNull
    private Integer price;
    @NotNull
    private Integer stock;

    private String description;

}
