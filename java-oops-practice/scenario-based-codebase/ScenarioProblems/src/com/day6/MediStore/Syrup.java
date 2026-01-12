package com.day6.MediStore;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Liquids expire 7 days before actual date once opened (simulated)
        LocalDate effectiveExpiry = getExpiryDate().minusDays(7);
        return LocalDate.now().isAfter(effectiveExpiry);
    }
}

