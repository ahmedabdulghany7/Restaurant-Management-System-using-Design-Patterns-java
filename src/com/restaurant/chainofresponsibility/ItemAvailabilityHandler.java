package com.restaurant.chainofresponsibility;

import com.restaurant.command.Order;
import java.util.HashSet;
import java.util.Set;

public class ItemAvailabilityHandler extends OrderValidationHandler {
    private Set<String> availableItems;
    
    public ItemAvailabilityHandler() {
        this.availableItems = new HashSet<>();
        availableItems.add("Bruschetta al Pomodoro");
        availableItems.add("Risotto al Tartufo");
        availableItems.add("Tiramisu");
        availableItems.add("Spring Rolls");
        availableItems.add("Pad Thai Shrimp");
        availableItems.add("Mango Sticky Rice");
    }
    
    @Override
    protected boolean validateOrder(Order order) {
        for (String item : order.getItems()) {
            if (!availableItems.contains(item)) {
                print("Item not available: " + item);
                return false;
            }
        }
        print("All items are available");
        return true;
    }
    
    @Override
    protected String getValidationName() {
        return "Availability Validator";
    }
}
