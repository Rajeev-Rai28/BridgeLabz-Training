package com.day9.PayXpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        System.out.println("🌐 Reminder: Please pay your Internet Bill to continue services!");
    }
}
