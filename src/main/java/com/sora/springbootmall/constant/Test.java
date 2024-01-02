package com.sora.springbootmall.constant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.i18n.LocaleContextHolder;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
@Slf4j
public class Test {

    public static void main(String[] args) {
//        ProductCategory category = ProductCategory.FOOD;
//        String s = category.name();
//        System.out.println(s); //輸出為FOOD
//
//        String s2 = "CAR";
//        ProductCategory category2 = ProductCategory.valueOf(s2);
//        System.out.println(category2); //找到enum類型是否有這個分類

//        System.out.println(System.currentTimeMillis());
//
//        long nowlong = System.currentTimeMillis();  // 我的電腦現是 2022-07-28 17:03:54
//
//        System.out.println("取出 long:\t" + nowlong);
//
//        System.out.println("......Long 轉 LocalDateTime");
//
//        System.out.println("系統預設時區 : " + ZoneId.systemDefault());
//
//        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(nowlong), ZoneId.systemDefault());
//
//        System.out.println("時區 - 日期時間格式如下:");
//
//        System.out.println(localDateTime.atZone(ZoneId.systemDefault()));  //記得指定時區
//
//        System.out.println(localDateTime.atZone(ZoneId.of("UTC"))); //指定時區, ex: Asia/Taipei
//
//        System.out.println(localDateTime); //未指定


//        Instant now = Instant.now();
//
//        ZoneId userZoneId = ZoneId.systemDefault(); // Example
//        ZonedDateTime userLocalTime = now.atZone(userZoneId);
//
//        System.out.println(userLocalTime);

        TimeZone userTimeZone = LocaleContextHolder.getTimeZone();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(userTimeZone);
        log.info(dateFormat.format(new Date()));

//        ZonedDateTime now = ZonedDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = now.format(formatter);
//
//        System.out.println(formattedDateTime);
//
//        System.out.println(new Date());

//        var now = new Date();
//
//        // 目前時區
//        var sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(now)); // 2023-08-25 11:22:39
//
//        // 變換時區
//        sdf.setTimeZone(TimeZone.getTimeZone("America/NewYork"));
//        System.out.println(sdf.format(now)); // 2023-08-25 03:22:39



    }


}
