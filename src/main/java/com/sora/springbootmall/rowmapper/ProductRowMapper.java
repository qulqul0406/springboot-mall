package com.sora.springbootmall.rowmapper;

import com.sora.springbootmall.constant.ProductCategory;
import com.sora.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();

        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));

//        String categoryStr = rs.getString("category");
//        ProductCategory category = ProductCategory.valueOf(categoryStr);
        product.setCategory(ProductCategory.valueOf(rs.getString("category")));
//        product.setCategory(rs.getString("category"));

        product.setImageUrl(rs.getString("image_url"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));
        Timestamp timestamp = rs.getTimestamp("created_date");
        product.setCreateDate(rs.getTimestamp("created_date"));
        product.setLastModifiedDate(rs.getTimestamp("last_modified_date"));

        return product;
    }
}
