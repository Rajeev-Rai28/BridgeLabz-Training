package com.day6.TourMate;

import java.util.List;

public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration, Transport transport, Hotel hotel, List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("✅ Booking International Trip to " + destination);
        System.out.println("🛂 Passport and Visa verification required.");
    }

    @Override
    public void cancel() {
        System.out.println("❌ International trip to " + destination + " cancelled with refund rules.");
    }
}

