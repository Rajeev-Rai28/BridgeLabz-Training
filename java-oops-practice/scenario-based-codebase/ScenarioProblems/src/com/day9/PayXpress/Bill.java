package com.day9.PayXpress;

public abstract class Bill implements IPayable {

    private String type;
    private double amount;
    private String dueDate;
    private boolean isPaid;

    // Constructor
    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false; // default unpaid
    }

    // Public method to pay bill (Encapsulation)
    public void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " bill paid successfully. Amount: " + amount);
        } else {
            System.out.println(type + " bill already paid.");
        }
    }

    // Late fee calculation
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Getter methods (no setter for isPaid → Encapsulation)
    public String getType() {
        return type;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public double getAmount() {
        return amount;
    }

    // Abstract method for polymorphism
    public abstract void sendReminder();
}

