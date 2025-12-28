package com.constructors.levelone;

public class CarRental {

    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Constructor to initialize rental details
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        double costPerDay = 1500; // fixed rental cost per day
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + totalCost);
    }
}

