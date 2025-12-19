package com.restaurant.command;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<String> items;
    private OrderStatus status;
    private double totalPrice;
    
    public enum OrderStatus {
        PENDING, PLACED, CONFIRMED, CANCELLED, DELIVERED
    }
    
    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.status = OrderStatus.PENDING;
        this.totalPrice = 0.0;
    }
    
    public int getOrderId() {
        return orderId;
    }
    
    public void addItem(String item, double price) {
        items.add(item);
        this.totalPrice += price;
    }
    
    public List<String> getItems() {
        return new ArrayList<>(items);
    }
    
    public OrderStatus getStatus() {
        return status;
    }
    
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }
    
    @Override
    public String toString() {
        return "Order #" + orderId + " - Status: " + status + " - Total: $" + totalPrice;
    }
}
