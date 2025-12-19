package com.restaurant.factory;

public class MainDish extends MenuItem {
    private String cuisine;
    
    public MainDish(String name, double price, String description, String cuisine) {
        super(name, price, description);
        this.cuisine = cuisine;
    }
    
    public String getCuisine() {
        return cuisine;
    }
    
    @Override
    public String getType() {
        return "MAIN_DISH";
    }
}
