package com.sora.springbootmall.model;

import com.sora.springbootmall.constant.ProductCategory;
import lombok.Data;

import java.util.Date;


@Data
public class Product {
    private Integer productId;
    private String productName;
    private ProductCategory category;
//    private String category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
    private Date createdDate;
    private Date lastModifiedDate;
}
