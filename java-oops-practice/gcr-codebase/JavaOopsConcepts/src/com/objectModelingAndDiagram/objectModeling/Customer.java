package com.objectModelingAndDiagram.objectModeling;

public class Customer {
    String name;
    double balance;

    // Constructor
    Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    // View balance
    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}

