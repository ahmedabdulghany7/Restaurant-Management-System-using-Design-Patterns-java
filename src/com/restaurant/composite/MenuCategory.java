package com.restaurant.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory extends MenuComponent {
    private String name;
    private List<MenuComponent> components;
    
    public MenuCategory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return 0;
    }
    
    @Override
    public void print() {
        System.out.println("\n" + name + ":");
        for (MenuComponent component : components) {
            component.print();
        }
    }
    
    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }
    
    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }
    
    public List<MenuComponent> getComponents() {
        return new ArrayList<>(components);
    }
}
