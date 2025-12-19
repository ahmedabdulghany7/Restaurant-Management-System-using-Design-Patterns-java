package com.restaurant.bridge;

public class SMSNotification implements NotificationMethod {
    private String phoneNumber;
    
    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void sendNotification(String message) {
        System.out.println("  [SMS to " + phoneNumber + "]: " + message);
    }
    
    @Override
    public String getMethodName() {
        return "SMS (" + phoneNumber + ")";
    }
}
