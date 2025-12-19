package com.restaurant.factory;

public class Dessert extends MenuItem {
    private boolean hasNuts;
    
    public Dessert(String name, double price, String description, boolean hasNuts) {
        super(name, price, description);
        this.hasNuts = hasNuts;
    }
    
    public boolean hasNuts() {
        return hasNuts;
    }
    
    @Override
    public String getType() {
        return "DESSERT";
    }
}
