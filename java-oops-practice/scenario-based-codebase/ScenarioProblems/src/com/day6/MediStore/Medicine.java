package com.day6.MediStore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;   // internal stock (hidden)

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10); // default quantity = 10
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Protected access for child classes
    protected LocalDate getExpiryDate() {
        return expiryDate;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    // Private sensitive pricing logic
    private double applyDiscount(double total) {
        if (total > 500) {
            return total * 0.90; // 10% discount
        }
        return total;
    }

    // Final sell logic (stock + billing controlled here)
    @Override
    public void sell(int qty) {
        if (checkExpiry()) {
            System.out.println("❌ Cannot sell expired medicine: " + name);
            return;
        }

        if (qty > quantity) {
            System.out.println("❌ Not enough stock for " + name);
            return;
        }

        double total = price * qty;     // operator usage
        double finalAmount = applyDiscount(total);

        quantity -= qty;                // stock adjustment

        System.out.println("✅ Sold " + qty + " units of " + name);
        System.out.println("💰 Bill Amount: ₹" + finalAmount);
        System.out.println("📦 Remaining Stock: " + quantity);
    }

    public String getName() {
        return name;
    }
}

