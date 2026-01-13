package com.day3.ParcelTracker;

public class ParcelTrackerApp {

    public static void main(String[] args) {

        ParcelRoute tracker = new ParcelRoute();

        // Create default delivery chain
        tracker.createDefaultChain();

        // Track parcel
        tracker.trackParcel();

        // Add custom checkpoint
        tracker.addAfter("Shipped", "Security Check");

        // Track again
        tracker.trackParcel();

        // Check delivery status
        tracker.checkStatus();

        // Simulate lost parcel  
        tracker.breakChainAfter("In Transit");

        // Track again
        tracker.trackParcel();

        // Check status again
        tracker.checkStatus();
    }
}
