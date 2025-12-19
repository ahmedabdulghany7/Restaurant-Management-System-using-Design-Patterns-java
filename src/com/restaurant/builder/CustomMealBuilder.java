package com.restaurant.builder;

import java.util.ArrayList;
import java.util.List;

public class CustomMealBuilder {
    private String baseName;
    private double basePrice;
    private List<Ingredient> ingredients;
    private String specialRequest;
    
    public CustomMealBuilder(String baseName, double basePrice) {
        this.baseName = baseName;
        this.basePrice = basePrice;
        this.ingredients = new ArrayList<>();
        this.specialRequest = "None";
    }
    
    public CustomMealBuilder addIngredient(String ingredientName, double price) {
        ingredients.add(new Ingredient(ingredientName, price));
        return this;
    }
    
    public CustomMealBuilder addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }
    
    public CustomMealBuilder addSpecialRequest(String request) {
        this.specialRequest = request;
        return this;
    }
    
    public CustomMeal build() {
        return new CustomMeal(baseName, basePrice, ingredients, specialRequest);
    }
}
