package com.mgmt.orders.controllers;

import java.util.List;


import com.mgmt.orders.dto.OrderResponseDto;
import com.mgmt.orders.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<OrderResponseDto>> getOrders(@PathVariable("userId") Long userId){
        List<OrderResponseDto> orders = orderService.getAllOrdersofUser(userId);
        return new ResponseEntity<List<OrderResponseDto>>(orders, HttpStatus.OK);
    }
}