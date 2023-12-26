package com.sora.springbootmall.constant;

public class Test {
    public static void main(String[] args) {
        ProductCategory category = ProductCategory.FOOD;
        String s = category.name();
        System.out.println(s); //輸出為FOOD

        String s2 = "CAR";
        ProductCategory category2 = ProductCategory.valueOf(s2);
        System.out.println(category2); //找到enum類型是否有這個分類
    }

}
