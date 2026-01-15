package com.day9.PayXpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("⚡ Reminder: Please pay your Electricity Bill to avoid power disconnection!");
    }
}
