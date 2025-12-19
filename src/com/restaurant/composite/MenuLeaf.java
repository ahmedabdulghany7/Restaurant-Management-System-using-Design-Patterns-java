package com.restaurant.composite;

public class MenuLeaf extends MenuComponent {
    private String name;
    private double price;
    private String description;
    
    public MenuLeaf(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void print() {
        System.out.println("  " + name + " - $" + price + " (" + description + ")");
    }
    
    @Override
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException("Cannot add to a menu item");
    }
    
    @Override
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a menu item");
    }
}
