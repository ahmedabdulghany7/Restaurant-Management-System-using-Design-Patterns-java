package com.restaurant.chainofresponsibility;

import com.restaurant.command.Order;

public class PriceValidationHandler extends OrderValidationHandler {
    private double maxOrderPrice;
    
    public PriceValidationHandler(double maxOrderPrice) {
        this.maxOrderPrice = maxOrderPrice;
    }
    
    @Override
    protected boolean validateOrder(Order order) {
        if (order.getTotalPrice() > maxOrderPrice) {
            print("Order price $" + order.getTotalPrice() + " exceeds maximum $" + maxOrderPrice);
            return false;
        }
        print("Order price $" + order.getTotalPrice() + " is valid");
        return true;
    }
    
    @Override
    protected String getValidationName() {
        return "Price Validator";
    }
}
