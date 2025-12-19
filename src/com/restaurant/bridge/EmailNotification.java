package com.restaurant.bridge;

public class EmailNotification implements NotificationMethod {
    private String email;
    
    public EmailNotification(String email) {
        this.email = email;
    }
    
    @Override
    public void sendNotification(String message) {
        System.out.println("  [Email to " + email + "]: " + message);
    }
    
    @Override
    public String getMethodName() {
        return "Email (" + email + ")";
    }
}
