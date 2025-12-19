package com.restaurant.command;

public class PlaceOrderCommand implements OrderCommand {
    private Order order;
    private Order.OrderStatus previousStatus;
    
    public PlaceOrderCommand(Order order) {
        this.order = order;
        this.previousStatus = order.getStatus();
    }
    
    @Override
    public void execute() {
        order.setStatus(Order.OrderStatus.PLACED);
    }
    
    @Override
    public void undo() {
        order.setStatus(previousStatus);
    }
    
    @Override
    public String getDescription() {
        return "Place Order #" + order.getOrderId();
    }
}
