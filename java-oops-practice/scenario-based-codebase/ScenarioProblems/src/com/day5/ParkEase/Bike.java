package com.day5.ParkEase;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 6;
        double penalty = 0;

        if (hours > allowedHours) {
            penalty = (hours - allowedHours) * 10;
        }

        return (baseRate * hours) + penalty;
    }
}

