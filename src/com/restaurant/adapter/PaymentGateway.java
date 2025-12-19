package com.restaurant.adapter;

public interface PaymentGateway {
    boolean pay(double amount);
    String getPaymentMethod();
}
