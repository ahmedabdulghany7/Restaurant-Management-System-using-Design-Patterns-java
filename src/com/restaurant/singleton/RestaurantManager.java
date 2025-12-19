package com.restaurant.singleton;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private static RestaurantManager instance;
    private List<String> orders;
    private String restaurantName;
    
    private RestaurantManager() {
        this.orders = new ArrayList<>();
        this.restaurantName = "Gourmet Restaurant";
    }
    
    public static synchronized RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }
    
    public void addOrder(String order) {
        orders.add(order);
    }
    
    public List<String> getOrders() {
        return new ArrayList<>(orders);
    }
    
    public String getRestaurantName() {
        return restaurantName;
    }
    
    public void setRestaurantName(String name) {
        this.restaurantName = name;
    }
}
