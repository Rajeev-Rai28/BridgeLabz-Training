package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Buyer {
    String buyerName;
    ArrayList<Order> orders;

    Buyer(String buyerName) {
        this.buyerName = buyerName;
        orders = new ArrayList<>();
    }

    // Communication method
    void placeOrder(Order order) {
        orders.add(order);
        System.out.println(buyerName + " placed Order ID: " + order.orderId);
    }

    void viewOrders() {
        System.out.println("Orders placed by " + buyerName + ":");
        for (Order o : orders) {
            o.viewOrderDetails();
        }
    }
}

