package com.restaurant.abstractfactory;

public abstract class Meal {
    protected String name;
    protected double price;
    
    public Meal(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}
