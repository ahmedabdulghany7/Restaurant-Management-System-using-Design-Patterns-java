package com.restaurant.bridge;

public abstract class OrderType {
    protected NotificationMethod notificationMethod;
    
    public OrderType(NotificationMethod notificationMethod) {
        this.notificationMethod = notificationMethod;
    }
    
    public void setNotificationMethod(NotificationMethod method) {
        this.notificationMethod = method;
    }
    
    public abstract void placeOrder(String orderId, String description);
    public abstract void confirmOrder(String orderId);
    public abstract void cancelOrder(String orderId);
}
