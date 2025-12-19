package com.restaurant.composite;

public abstract class MenuComponent {
    public abstract String getName();
    public abstract double getPrice();
    public abstract void print();
    public abstract void add(MenuComponent component);
    public abstract void remove(MenuComponent component);
}
