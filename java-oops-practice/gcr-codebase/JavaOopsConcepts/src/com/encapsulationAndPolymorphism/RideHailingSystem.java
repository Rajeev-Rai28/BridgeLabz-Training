package com.encapsulationAndPolymorphism;

public class RideHailingSystem {

    static void generateFare(RideUnit ride, double distance) {
        ride.showRideDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + ride.computeFare(distance));
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        RideUnit r1 = new SedanRide(201, "Rajeev");
        RideUnit r2 = new BikeRide(202, "Aman");
        RideUnit r3 = new AutoRide(203, "Suresh");

        generateFare(r1, 8);
        generateFare(r2, 8);
        generateFare(r3, 8);
    }
}
