package com.mgmt.orders.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.mgmt.orders.dao.OrderRepository;
import com.mgmt.orders.dto.OrderResponseDto;
import com.mgmt.orders.models.Order;
import com.mgmt.orders.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderResponseDto> getAllOrdersofUser(Long userId) {
        List<Order> orders = orderRepository.findAllByUserId(userId);
        return orders.stream().map(order -> new OrderResponseDto(order)).collect(Collectors.toList());
    }

}