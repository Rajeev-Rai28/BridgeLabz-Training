package com.day5.ParkEase;

public class ParkEaseSystem {
    public static void main(String[] args) {

        // Create parking slots
        ParkingSlot carSlot = new ParkingSlot(1, "Ground Floor", "Car");
        ParkingSlot bikeSlot = new ParkingSlot(2, "First Floor", "Bike");

        // Create vehicles (Polymorphism)
        Vehicle car = new Car("MP04-1234");
        Vehicle bike = new Bike("MP04-5678");

        // Assign vehicles
        carSlot.assignVehicle(car);
        bikeSlot.assignVehicle(bike);

        // Calculate charges
        int carHours = 7;
        int bikeHours = 4;

        System.out.println("\n💰 Parking Charges:");
        System.out.println("Car Charges for " + carHours + " hours: ₹" + car.calculateCharges(carHours));
        System.out.println("Bike Charges for " + bikeHours + " hours: ₹" + bike.calculateCharges(bikeHours));

        // Show logs
        System.out.println("\n📄 Booking Logs:");
        System.out.println("Car Slot Log: " + carSlot.getBookingLog());
        System.out.println("Bike Slot Log: " + bikeSlot.getBookingLog());

        // Release slot
        carSlot.releaseSlot();
    }
}

