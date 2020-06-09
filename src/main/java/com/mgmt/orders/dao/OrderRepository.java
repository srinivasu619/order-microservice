package com.mgmt.orders.dao;

import java.util.List;

import com.mgmt.orders.models.Order;

public interface OrderRepository {
    public List<Order> findAllByUserId(Long userId);
}