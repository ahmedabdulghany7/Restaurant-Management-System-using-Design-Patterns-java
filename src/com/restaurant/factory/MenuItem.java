package com.restaurant.factory;

public abstract class MenuItem {
    protected String name;
    protected double price;
    protected String description;
    
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getDescription() {
        return description;
    }
    
    public abstract String getType();
    
    @Override
    public String toString() {
        return getName() + " ($" + getPrice() + ") - " + getDescription() + " [" + getType() + "]";
    }
}
