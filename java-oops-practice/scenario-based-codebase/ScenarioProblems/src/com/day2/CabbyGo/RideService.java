package com.day2.CabbyGo;

class RideService implements IRideService {

    private static final double BASE_FARE = 50;

    @Override
    public void bookRide(Vehicle vehicle, Driver driver, double distance) {
        vehicle.calculateFare(BASE_FARE, distance);

        System.out.println("Ride Booked!");
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Driver Rating: " + driver.getRating());
        System.out.println("Total Fare: ₹" + vehicle.getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Ride Ended. Thank you for choosing CabbyGo!");
    }
}