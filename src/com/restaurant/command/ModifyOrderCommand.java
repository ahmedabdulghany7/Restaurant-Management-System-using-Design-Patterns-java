package com.restaurant.command;

import java.util.ArrayList;
import java.util.List;

public class ModifyOrderCommand implements OrderCommand {
    private Order order;
    private List<String> previousItems;
    private double previousPrice;
    private String itemToAdd;
    private double itemPrice;
    
    public ModifyOrderCommand(Order order, String itemToAdd, double itemPrice) {
        this.order = order;
        this.previousItems = new ArrayList<>(order.getItems());
        this.previousPrice = order.getTotalPrice();
        this.itemToAdd = itemToAdd;
        this.itemPrice = itemPrice;
    }
    
    @Override
    public void execute() {
        order.addItem(itemToAdd, itemPrice);
    }
    
    @Override
    public void undo() {
        order = new Order(order.getOrderId());
        for (String item : previousItems) {
            order.addItem(item, 0);
        }
        order.setTotalPrice(previousPrice);
    }
    
    @Override
    public String getDescription() {
        return "Modify Order #" + order.getOrderId() + " - Add " + itemToAdd;
    }
}
