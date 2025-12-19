package com.restaurant.adapter;

public class ExternalPaymentSystem {
    public boolean processPayment(String cardNumber, String cardHolder, double amount) {
        if (cardNumber.length() != 16) {
            return false;
        }
        if (amount <= 0) {
            return false;
        }
        System.out.println("External Payment System: Processing payment of $" + amount + " for " + cardHolder);
        return true;
    }
}
