package com.restaurant.abstractfactory;

public class AsianMealFamily implements MealFamily {
    @Override
    public Appetizer createAppetizer() {
        return new AsianAppetizer();
    }
    
    @Override
    public MainCourse createMainCourse() {
        return new AsianMainCourse();
    }
    
    @Override
    public Dessert createDessert() {
        return new AsianDessert();
    }
    
    @Override
    public String getFamilyName() {
        return "Asian";
    }
}
