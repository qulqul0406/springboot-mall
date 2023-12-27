package com.sora.springbootmall.dto;

import com.sora.springbootmall.constant.ProductCategory;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class ProductQueryParams {

    ProductCategory category;
    String search;
    String orderBy;
    String sort;
}
