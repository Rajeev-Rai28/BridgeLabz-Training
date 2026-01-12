package com.day6.MediStore;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate, int qty) {
        super(name, price, expiryDate, qty);
    }

    @Override
    public boolean checkExpiry() {
        // Injections are very sensitive: expire 15 days earlier
        LocalDate effectiveExpiry = getExpiryDate().minusDays(15);
        return LocalDate.now().isAfter(effectiveExpiry);
    }
}
