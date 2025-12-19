package com.restaurant.abstractfactory;

public class ItalianMealFamily implements MealFamily {
    @Override
    public Appetizer createAppetizer() {
        return new ItalianAppetizer();
    }
    
    @Override
    public MainCourse createMainCourse() {
        return new ItalianMainCourse();
    }
    
    @Override
    public Dessert createDessert() {
        return new ItalianDessert();
    }
    
    @Override
    public String getFamilyName() {
        return "Italian";
    }
}
