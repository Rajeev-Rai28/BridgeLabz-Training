package com.constructors.levelone;

public class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared)
    static double registrationFee = 2000;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
        System.out.println("------------------------------");
    }

    // Class (static) method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

