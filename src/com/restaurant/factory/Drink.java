package com.restaurant.factory;

public class Drink extends MenuItem {
    private String size;
    
    public Drink(String name, double price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }
    
    public String getSize() {
        return size;
    }
    
    @Override
    public String getType() {
        return "DRINK";
    }
}
