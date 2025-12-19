package com.restaurant.adapter;

public class PaymentAdapter implements PaymentGateway {
    private ExternalPaymentSystem externalPaymentSystem;
    private String cardNumber;
    private String cardHolder;
    
    public PaymentAdapter(String cardNumber, String cardHolder) {
        this.externalPaymentSystem = new ExternalPaymentSystem();
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }
    
    @Override
    public boolean pay(double amount) {
        return externalPaymentSystem.processPayment(cardNumber, cardHolder, amount);
    }
    
    @Override
    public String getPaymentMethod() {
        return "Credit Card - " + cardNumber.substring(12);
    }
}
