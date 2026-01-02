package com.encapsulationAndPolymorphism;

abstract class RideUnit implements LocationService {

    protected int unitId;
    protected double costPerKm;

    private String driver;          // encapsulated
    private String currentLocation; // encapsulated

    public RideUnit(int unitId, String driver, double costPerKm) {
        this.unitId = unitId;
        this.driver = driver;
        this.costPerKm = costPerKm;
        this.currentLocation = "Not Assigned";
    }

    // Abstract method
    abstract double computeFare(double distance);

    // Concrete method
    public void showRideDetails() {
        System.out.println("Unit ID: " + unitId +
                ", Driver: " + driver +
                ", Rate/Km: ₹" + costPerKm);
    }

    @Override
    public String fetchLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

