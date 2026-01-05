package com.day2.CabbyGo;

abstract class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected double ratePerKm;

    private double fare;  

    public Vehicle(String vehicleNumber, int capacity, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.ratePerKm = ratePerKm;
    }

    public void calculateFare(double baseFare, double distance) {
        fare = baseFare + (distance * ratePerKm);
    }

    public double getFare() {
        return fare;
    }

    public abstract String getType();
}