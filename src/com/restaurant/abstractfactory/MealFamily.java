package com.restaurant.abstractfactory;

public interface MealFamily {
    Appetizer createAppetizer();
    MainCourse createMainCourse();
    Dessert createDessert();
    String getFamilyName();
}
