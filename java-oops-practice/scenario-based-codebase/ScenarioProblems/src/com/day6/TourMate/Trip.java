package com.day6.TourMate;

import java.util.List;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected List<Activity> activities;

    public Trip(String destination, int duration, Transport transport, Hotel hotel, List<Activity> activities) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activities = activities;

        calculateTotalBudget();
    }

    // Operators used here
    protected void calculateTotalBudget() {
        double activityCost = 0;
        for (Activity a : activities) {
            activityCost += a.getCost();
        }

        budget = hotel.getTotalCost() + transport.getCost() + activityCost;
    }

    public void showTripDetails() {
        System.out.println("📍 Destination: " + destination);
        System.out.println("🕒 Duration: " + duration + " days");
        System.out.println("🚗 Transport: " + transport.getType());
        System.out.println("🏨 Hotel: " + hotel.getName());
        System.out.println("💰 Total Budget: ₹" + budget);
    }
}

