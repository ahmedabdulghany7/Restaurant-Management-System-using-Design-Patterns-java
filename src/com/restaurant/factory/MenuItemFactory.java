package com.restaurant.factory;

public class MenuItemFactory {
    public static MenuItem createMenuItem(String type, String name, double price, String description, String extra) {
        switch (type.toLowerCase()) {
            case "drink":
                return new Drink(name, price, description, extra);
            case "maindish":
                return new MainDish(name, price, description, extra);
            case "dessert":
                return new Dessert(name, price, description, Boolean.parseBoolean(extra));
            default:
                throw new IllegalArgumentException("Unknown menu item type: " + type);
        }
    }
}
