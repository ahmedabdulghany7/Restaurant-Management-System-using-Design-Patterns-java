package com.restaurant.chainofresponsibility;

import com.restaurant.command.Order;

public class OrderStatusHandler extends OrderValidationHandler {
    @Override
    protected boolean validateOrder(Order order) {
        if (order.getStatus() == Order.OrderStatus.CANCELLED) {
            print("Order is already cancelled");
            return false;
        }
        if (order.getStatus() == Order.OrderStatus.PENDING || order.getStatus() == Order.OrderStatus.PLACED) {
            print("Order status is valid for processing");
            return true;
        }
        print("Order status is not valid for processing");
        return false;
    }
    
    @Override
    protected String getValidationName() {
        return "Status Validator";
    }
}
