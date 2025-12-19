package com.restaurant.bridge;

public class DineInOrder extends OrderType {
    private String tableNumber;
    
    public DineInOrder(NotificationMethod notificationMethod, String tableNumber) {
        super(notificationMethod);
        this.tableNumber = tableNumber;
    }
    
    @Override
    public void placeOrder(String orderId, String description) {
        String message = "Dine-In Order #" + orderId + " placed at Table " + tableNumber + ": " + description;
        System.out.println(message);
        notificationMethod.sendNotification(message);
    }
    
    @Override
    public void confirmOrder(String orderId) {
        String message = "Dine-In Order #" + orderId + " confirmed and being prepared";
        System.out.println(message);
        notificationMethod.sendNotification(message);
    }
    
    @Override
    public void cancelOrder(String orderId) {
        String message = "Dine-In Order #" + orderId + " has been cancelled";
        System.out.println(message);
        notificationMethod.sendNotification(message);
    }
}
