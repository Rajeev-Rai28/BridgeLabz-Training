package com.day6.MediStore;

import java.time.LocalDate;

public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Tablets last till exact expiry date
        return LocalDate.now().isAfter(getExpiryDate());
    }
}

