package com.day2.CabbyGo;

public class CabbyGoApp {
    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("MP09-1234"); // polymorphism
        Driver driver = new Driver("Rahul", "DL12345", 4.8);

        IRideService rideService = new RideService();
        rideService.bookRide(vehicle, driver, 12); // distance in km
        rideService.endRide();
    }
}
