package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    void viewOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.println("Total Amount: ₹" + calculateTotal());
        System.out.println();
    }
}

