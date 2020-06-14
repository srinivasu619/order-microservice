package com.mgmt.orders.dto;

import java.util.Date;

import com.mgmt.orders.models.Order;

public class OrderResponseDto {
    private Long orderId;
    private Integer orderAmount;
    private Date orderDate;

    public OrderResponseDto(Order order){
        this.orderId = order.getOrderId();
        this.orderAmount = order.getOrderAmount();
        this.orderDate = order.getOrderDate();
    }

    /**
     * @return the orderId
     */
    public Long getOrderId() {
        return orderId;
    }
    /**
     * @return the orderAmount
     */
    public Integer getOrderAmount() {
        return orderAmount;
    }
    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }
}