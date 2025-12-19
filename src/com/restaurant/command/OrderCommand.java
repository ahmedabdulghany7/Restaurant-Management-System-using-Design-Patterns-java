package com.restaurant.command;

public interface OrderCommand {
    void execute();
    void undo();
    String getDescription();
}
