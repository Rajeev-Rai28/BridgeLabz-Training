package com.inheritance.assistedProblems;

public class VehicleMain {
    public static void main(String[] args) {

        // Array of Vehicle type (Polymorphism)
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(140, "Petrol", true);

        // Dynamic method calls
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
