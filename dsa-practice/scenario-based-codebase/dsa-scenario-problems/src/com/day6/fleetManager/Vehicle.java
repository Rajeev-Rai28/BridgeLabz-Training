package com.day6.fleetManager;

public class Vehicle {

    private String vehicleNumber;
    private int mileage; // mileage after which maintenance is needed

    public Vehicle(String vehicleNumber, int mileage) {
        this.vehicleNumber = vehicleNumber;
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public String toString() {
        return "Vehicle " + vehicleNumber + " -> Mileage: " + mileage;
    }
}

