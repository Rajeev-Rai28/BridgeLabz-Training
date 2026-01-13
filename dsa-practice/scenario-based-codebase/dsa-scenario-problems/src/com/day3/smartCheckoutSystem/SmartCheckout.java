package com.day3.smartCheckoutSystem;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> customerQueue;
    private HashMap<String, Item> store;

    public SmartCheckout() {
        customerQueue = new LinkedList<>();
        store = new HashMap<>();
    }

    // Add item to store
    public void addItemToStore(String name, double price, int stock) {
        store.put(name, new Item(name, price, stock));
    }

    // Add customer to queue
    public void addCustomer(Customer c) {
        customerQueue.add(c);
        System.out.println(c.getName() + " added to billing queue.");
    }

    // Process one customer
    public void processCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer c = customerQueue.poll(); // remove from queue
        System.out.println("\nProcessing bill for: " + c.getName());

        double totalBill = 0;

        for (String itemName : c.getCart().keySet()) {
            int qty = c.getCart().get(itemName);

            if (!store.containsKey(itemName)) {
                System.out.println(itemName + " not found in store!");
                continue;
            }

            Item item = store.get(itemName);

            if (item.getStock() >= qty) {
                double cost = item.getPrice() * qty;
                totalBill += cost;
                item.reduceStock(qty); // update stock

                System.out.println(itemName + " x " + qty + " = " + cost);
            } else {
                System.out.println(itemName + " has insufficient stock!");
            }
        }

        System.out.println("Total Bill = ₹" + totalBill);
    }
}

