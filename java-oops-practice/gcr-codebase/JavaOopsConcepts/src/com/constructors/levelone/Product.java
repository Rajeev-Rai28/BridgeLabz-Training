package com.constructors.levelone;

public class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable (shared)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increments whenever a new object is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("-------------------");
    }

    // Class (static) method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

