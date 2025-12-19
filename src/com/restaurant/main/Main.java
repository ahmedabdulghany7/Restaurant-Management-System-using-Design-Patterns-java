package com.restaurant.main;

import com.restaurant.singleton.RestaurantManager;
import com.restaurant.factory.MenuItemFactory;
import com.restaurant.factory.MenuItem;
import com.restaurant.abstractfactory.*;
import com.restaurant.builder.CustomMealBuilder;
import com.restaurant.builder.CustomMeal;
import com.restaurant.command.*;
import com.restaurant.chainofresponsibility.*;
import com.restaurant.composite.*;
import com.restaurant.adapter.PaymentAdapter;
import com.restaurant.bridge.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Restaurant Management System ===\n");
        
        demonstrateSingleton();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateFactory();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateAbstractFactory();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateBuilder();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateCommand();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateChainOfResponsibility();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateComposite();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateAdapter();
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        demonstrateBridge();
    }
    
    private static void demonstrateSingleton() {
        System.out.println("SINGLETON PATTERN - Restaurant Manager");
        RestaurantManager manager1 = RestaurantManager.getInstance();
        RestaurantManager manager2 = RestaurantManager.getInstance();
        
        System.out.println("Restaurant: " + manager1.getRestaurantName());
        System.out.println("Same instance: " + (manager1 == manager2));
        
        manager1.addOrder("Order 1: Italian Dinner");
        manager2.addOrder("Order 2: Asian Lunch");
        
        System.out.println("Orders in system: " + manager1.getOrders().size());
    }
    
    private static void demonstrateFactory() {
        System.out.println("FACTORY PATTERN - Menu Item Creation");
        
        MenuItem drink = MenuItemFactory.createMenuItem("drink", "Cappuccino", 4.99, "Italian Coffee", "Large");
        MenuItem mainDish = MenuItemFactory.createMenuItem("maindish", "Grilled Salmon", 22.99, "Fresh Atlantic Salmon", "Italian");
        MenuItem dessert = MenuItemFactory.createMenuItem("dessert", "Cheesecake", 8.99, "NY Style", "false");
        
        System.out.println(drink);
        System.out.println(mainDish);
        System.out.println(dessert);
    }
    
    private static void demonstrateAbstractFactory() {
        System.out.println("ABSTRACT FACTORY PATTERN - Meal Families");
        
        MealFamily italian = new ItalianMealFamily();
        MealFamily asian = new AsianMealFamily();
        MealFamily fastFood = new FastFoodMealFamily();
        
        System.out.println("\n" + italian.getFamilyName() + " Meal:");
        System.out.println("  Appetizer: " + italian.createAppetizer());
        System.out.println("  Main Course: " + italian.createMainCourse());
        System.out.println("  Dessert: " + italian.createDessert());
        
        System.out.println("\n" + asian.getFamilyName() + " Meal:");
        System.out.println("  Appetizer: " + asian.createAppetizer());
        System.out.println("  Main Course: " + asian.createMainCourse());
        System.out.println("  Dessert: " + asian.createDessert());
        
        System.out.println("\n" + fastFood.getFamilyName() + " Meal:");
        System.out.println("  Appetizer: " + fastFood.createAppetizer());
        System.out.println("  Main Course: " + fastFood.createMainCourse());
        System.out.println("  Dessert: " + fastFood.createDessert());
    }
    
    private static void demonstrateBuilder() {
        System.out.println("BUILDER PATTERN - Custom Meal Construction");
        
        CustomMeal customMeal = new CustomMealBuilder("Grilled Chicken", 15.99)
            .addIngredient("Extra Garlic", 0.50)
            .addIngredient("Grilled Vegetables", 2.00)
            .addIngredient("Special Sauce", 1.50)
            .addSpecialRequest("No salt, extra lemon")
            .build();
        
        System.out.println(customMeal);
    }
    
    private static void demonstrateCommand() {
        System.out.println("COMMAND PATTERN - Order Operations");
        
        Order order = new Order(101);
        order.addItem("Bruschetta al Pomodoro", 8.99);
        order.addItem("Risotto al Tartufo", 18.99);
        
        List<OrderCommand> commands = new ArrayList<>();
        
        PlaceOrderCommand placeCmd = new PlaceOrderCommand(order);
        commands.add(placeCmd);
        placeCmd.execute();
        System.out.println(order);
        
        ModifyOrderCommand modifyCmd = new ModifyOrderCommand(order, "Tiramisu", 7.99);
        commands.add(modifyCmd);
        modifyCmd.execute();
        System.out.println(order);
        
        System.out.println("\nUndoing last command...");
        modifyCmd.undo();
        System.out.println(order);
    }
    
    private static void demonstrateChainOfResponsibility() {
        System.out.println("CHAIN OF RESPONSIBILITY - Order Validation");
        
        OrderValidationHandler statusHandler = new OrderStatusHandler();
        OrderValidationHandler priceHandler = new PriceValidationHandler(500.0);
        OrderValidationHandler availabilityHandler = new ItemAvailabilityHandler();
        
        statusHandler.setNextHandler(priceHandler);
        priceHandler.setNextHandler(availabilityHandler);
        
        Order order = new Order(102);
        order.setStatus(Order.OrderStatus.PLACED);
        order.addItem("Risotto al Tartufo", 18.99);
        order.addItem("Tiramisu", 7.99);
        
        System.out.println("Validating order...");
        boolean isValid = statusHandler.validate(order);
        System.out.println("Order validation result: " + (isValid ? "VALID" : "INVALID"));
    }
    
    private static void demonstrateComposite() {
        System.out.println("COMPOSITE PATTERN - Menu Hierarchy");
        
        MenuCategory appetizers = new MenuCategory("Appetizers");
        appetizers.add(new MenuLeaf("Bruschetta al Pomodoro", 8.99, "Italian"));
        appetizers.add(new MenuLeaf("Spring Rolls", 7.99, "Asian"));
        
        MenuCategory mainCourses = new MenuCategory("Main Courses");
        mainCourses.add(new MenuLeaf("Risotto al Tartufo", 18.99, "Italian"));
        mainCourses.add(new MenuLeaf("Pad Thai Shrimp", 16.99, "Asian"));
        
        MenuCategory desserts = new MenuCategory("Desserts");
        desserts.add(new MenuLeaf("Tiramisu", 7.99, "Italian"));
        desserts.add(new MenuLeaf("Mango Sticky Rice", 6.99, "Asian"));
        
        MenuCategory menu = new MenuCategory("Complete Menu");
        menu.add(appetizers);
        menu.add(mainCourses);
        menu.add(desserts);
        
        menu.print();
    }
    
    private static void demonstrateAdapter() {
        System.out.println("ADAPTER PATTERN - Payment Processing");
        
        PaymentAdapter paymentAdapter = new PaymentAdapter("4532123456789012", "John Doe");
        
        System.out.println("Payment Method: " + paymentAdapter.getPaymentMethod());
        System.out.println("Processing payment of $125.50...");
        
        boolean paymentSuccess = paymentAdapter.pay(125.50);
        System.out.println("Payment Status: " + (paymentSuccess ? "SUCCESS" : "FAILED"));
    }
    
    private static void demonstrateBridge() {
        System.out.println("BRIDGE PATTERN - Order Types and Notifications");
        
        NotificationMethod emailNotification = new EmailNotification("customer@email.com");
        NotificationMethod smsNotification = new SMSNotification("+1234567890");
        
        OrderType dineInOrder = new DineInOrder(emailNotification, "Table 5");
        OrderType deliveryOrder = new DeliveryOrder(smsNotification, "123 Main St");
        
        System.out.println("\n--- Dine-In Order with Email Notification ---");
        dineInOrder.placeOrder("103", "2 Risotto, 1 Tiramisu");
        dineInOrder.confirmOrder("103");
        
        System.out.println("\n--- Delivery Order with SMS Notification ---");
        deliveryOrder.placeOrder("104", "3 Pad Thai, 2 Mango Sticky Rice");
        deliveryOrder.confirmOrder("104");
        
        System.out.println("\n--- Switching notification method ---");
        dineInOrder.setNotificationMethod(smsNotification);
        dineInOrder.cancelOrder("103");
    }
}
