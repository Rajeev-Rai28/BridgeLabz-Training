package com.objectModelingAndDiagram.objectModeling;

public class Bank {
    String bankName;

    // Constructor
    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Open account for customer
    void openAccount(Customer customer, double initialDeposit) {
        customer.balance = initialDeposit;
        System.out.println("Account opened for " + customer.name +
                " in " + bankName + " with ₹" + initialDeposit);
    }
}

