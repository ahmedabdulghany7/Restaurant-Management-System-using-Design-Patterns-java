package com.restaurant.chainofresponsibility;

import com.restaurant.command.Order;

public abstract class OrderValidationHandler {
    protected OrderValidationHandler nextHandler;
    
    public void setNextHandler(OrderValidationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    
    public boolean validate(Order order) {
        if (!validateOrder(order)) {
            return false;
        }
        
        if (nextHandler != null) {
            return nextHandler.validate(order);
        }
        
        return true;
    }
    
    protected abstract boolean validateOrder(Order order);
    protected abstract String getValidationName();
    
    protected void print(String message) {
        System.out.println("[" + getValidationName() + "] " + message);
    }
}
