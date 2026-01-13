package com.day3.smartCheckoutSystem;

import java.util.HashMap;

public class Customer {
    private String name;
    private HashMap<String, Integer> cart; // itemName -> quantity

    public Customer(String name) {
        this.name = name;
        this.cart = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getCart() {
        return cart;
    }

    public void addItem(String itemName, int quantity) {
        cart.put(itemName, quantity);
    }
}
