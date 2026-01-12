package com.day6.MediStore;

import java.time.LocalDate;

public class MediStoreApp {
    public static void main(String[] args) {

        // Polymorphism
        Medicine m1 = new Tablet("Paracetamol", 5, LocalDate.of(2026, 5, 10));
        Medicine m2 = new Syrup("Cough Syrup", 120, LocalDate.of(2026, 3, 1));
        Medicine m3 = new Injection("Insulin", 350, LocalDate.of(2026, 2, 1), 5);

        System.out.println("---- Selling Tablets ----");
        m1.sell(50);

        System.out.println("\n---- Selling Syrup ----");
        m2.sell(3);

        System.out.println("\n---- Selling Injection ----");
        m3.sell(2);
    }
}

