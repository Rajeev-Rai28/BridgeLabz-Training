package com.day9.PayXpress;

public class PayXpressApp {

    public static void main(String[] args) {

        // Polymorphism
        Bill b1 = new ElectricityBill(1200, "20-Jan-2026");
        Bill b2 = new WaterBill(500, "18-Jan-2026");
        Bill b3 = new InternetBill(999, "15-Jan-2026");

        // Send reminders
        b1.sendReminder();
        b2.sendReminder();
        b3.sendReminder();

        System.out.println();

        // Pay bills
        b1.pay();
        b2.pay();

        System.out.println();

        // Late fee calculation
        double lateAmount = b3.calculateLateFee(100);
        System.out.println("Internet Bill with late fee: " + lateAmount);
    }
}

