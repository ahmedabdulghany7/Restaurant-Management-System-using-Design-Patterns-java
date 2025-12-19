package com.restaurant.command;

public class CancelOrderCommand implements OrderCommand {
    private Order order;
    private Order.OrderStatus previousStatus;
    
    public CancelOrderCommand(Order order) {
        this.order = order;
        this.previousStatus = order.getStatus();
    }
    
    @Override
    public void execute() {
        order.setStatus(Order.OrderStatus.CANCELLED);
    }
    
    @Override
    public void undo() {
        order.setStatus(previousStatus);
    }
    
    @Override
    public String getDescription() {
        return "Cancel Order #" + order.getOrderId();
    }
}
