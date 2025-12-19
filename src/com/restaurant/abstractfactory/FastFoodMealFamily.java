package com.restaurant.abstractfactory;

public class FastFoodMealFamily implements MealFamily {
    @Override
    public Appetizer createAppetizer() {
        return new FastFoodAppetizer();
    }
    
    @Override
    public MainCourse createMainCourse() {
        return new FastFoodMainCourse();
    }
    
    @Override
    public Dessert createDessert() {
        return new FastFoodDessert();
    }
    
    @Override
    public String getFamilyName() {
        return "Fast Food";
    }
}
