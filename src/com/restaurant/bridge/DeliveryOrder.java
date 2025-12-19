package com.restaurant.bridge;

public class DeliveryOrder extends OrderType {
    private String deliveryAddress;
    
    public DeliveryOrder(NotificationMethod notificationMethod, String deliveryAddress) {
        super(notificationMethod);
        this.deliveryAddress = deliveryAddress;
    }
    
    @Override
    public void placeOrder(String orderId, String description) {
        String message = "Delivery Order #" + orderId + " placed for " + deliveryAddress + ": " + description;
        System.out.println(message);
        notificationMethod.sendNotification(message);
    }
    
    @Override
    public void confirmOrder(String orderId) {
        String message = "Delivery Order #" + orderId + " confirmed. Driver will arrive soon.";
        System.out.println(message);
        notificationMethod.sendNotification(message);
    }
    
    @Override
    public void cancelOrder(String orderId) {
        String message = "Delivery Order #" + orderId + " has been cancelled";
        System.out.println(message);
        notificationMethod.sendNotification(message);
    }
}
