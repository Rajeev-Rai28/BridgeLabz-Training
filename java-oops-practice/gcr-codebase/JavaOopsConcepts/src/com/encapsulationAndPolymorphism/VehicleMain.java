package com.encapsulationAndPolymorphism;

import java.util.*;

public class VehicleMain {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MP04-1234", 2000, "CAR987654"));
        vehicles.add(new Bike("MP04-5678", 500, "BIK456789"));
        vehicles.add(new Truck("MP04-9999", 5000, "TRK123456"));

        int rentalDays = 3;

        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: " + rentalCost);

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance();
                System.out.println(ins.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insuranceCost);
            }

            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("----------------------------------");
        }
    }
}
