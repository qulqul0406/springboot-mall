package com.sora.springbootmall.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer productId;
    private String productName;
    private String category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
    private  Date createDate;
    private Date lastModifiedDate;
}
