package com.day9.PayXpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("💧 Reminder: Please pay your Water Bill to avoid supply interruption!");
    }
}
