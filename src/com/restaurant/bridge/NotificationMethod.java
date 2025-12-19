package com.restaurant.bridge;

public interface NotificationMethod {
    void sendNotification(String message);
    String getMethodName();
}
