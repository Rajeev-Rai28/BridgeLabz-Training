package com.objectModelingAndDiagram.objectModeling;

public class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println(productName + " - ₹" + price);
    }
}

