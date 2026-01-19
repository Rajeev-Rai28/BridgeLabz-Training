package com.Generics.SmartWarehouseManagementSystem;


public class Groceries extends WarehouseItem {

    public Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
    
}
