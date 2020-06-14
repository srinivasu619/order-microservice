package com.mgmt.orders.services;

import java.util.List;

import com.mgmt.orders.dto.OrderResponseDto;

public interface OrderService {
    public List<OrderResponseDto> getAllOrdersofUser(Long userId);
}