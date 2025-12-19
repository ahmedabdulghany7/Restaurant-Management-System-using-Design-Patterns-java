package com.restaurant.builder;

import java.util.ArrayList;
import java.util.List;

public class CustomMeal {
    private String baseName;
    private double basePrice;
    private List<Ingredient> ingredients;
    private String specialRequest;
    
    public CustomMeal(String baseName, double basePrice, List<Ingredient> ingredients, String specialRequest) {
        this.baseName = baseName;
        this.basePrice = basePrice;
        this.ingredients = new ArrayList<>(ingredients);
        this.specialRequest = specialRequest;
    }
    
    public String getBaseName() {
        return baseName;
    }
    
    public double getBasePrice() {
        return basePrice;
    }
    
    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }
    
    public String getSpecialRequest() {
        return specialRequest;
    }
    
    public double getTotalPrice() {
        double total = basePrice;
        for (Ingredient ingredient : ingredients) {
            total += ingredient.getPrice();
        }
        return total;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Custom Meal: ").append(baseName).append("\n");
        sb.append("Base Price: $").append(basePrice).append("\n");
        sb.append("Additional Ingredients:\n");
        for (Ingredient ingredient : ingredients) {
            sb.append("  - ").append(ingredient).append("\n");
        }
        sb.append("Special Request: ").append(specialRequest).append("\n");
        sb.append("Total Price: $").append(getTotalPrice());
        return sb.toString();
    }
}
