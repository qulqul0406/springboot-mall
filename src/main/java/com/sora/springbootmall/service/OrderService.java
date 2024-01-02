package com.sora.springbootmall.service;

import com.sora.springbootmall.dto.CreateOrderRequest;
import com.sora.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
