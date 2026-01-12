package com.day5.ParkEase;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 3;
        double penalty = 0;

        if (hours > allowedHours) {
            penalty = (hours - allowedHours) * 50;
        }

        return (baseRate * hours) + penalty;
    }
}

