package com.mgmt.orders.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import com.mgmt.orders.dao.OrderRepository;
import com.mgmt.orders.models.Order;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private List<Order> orders;

    public OrderRepositoryImpl() {
        orders = new ArrayList<>();
        LongStream.range(1, 10).forEach(orderId -> {
            Order order = new Order();
            order.setOrderId(orderId);
            order.setOrderAmount(500);
            order.setUserId((orderId % 2) + 1);
            order.setOrderDate(new Date());
            this.orders.add(order);
        });
    }

    @Override
    public List<Order> findAllByUserId(Long userId) {
        List<Order> filteredOrders = this.orders.stream().filter(order -> order.getUserId().equals(userId)).collect(Collectors.toList());
        return filteredOrders;
    }

}