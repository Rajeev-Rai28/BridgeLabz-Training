package com.day2.callcenter;

public class Customer {

    String customerId;
    String name;
    boolean isPriority;

    public Customer(String customerId, String name, boolean isPriority) {
        this.customerId = customerId;
        this.name = name;
        this.isPriority = isPriority;
    }

    @Override
    public String toString() {
        return name + " (ID: " + customerId + ", Priority: " + isPriority + ")";
    }
}

