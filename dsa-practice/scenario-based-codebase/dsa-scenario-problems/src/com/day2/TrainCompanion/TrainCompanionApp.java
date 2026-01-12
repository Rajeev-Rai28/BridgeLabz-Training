package com.day2.TrainCompanion;

public class TrainCompanionApp {

    public static void main(String[] args) {

        TrainRoute train = new TrainRoute();

        // Create train compartments
        train.addCompartment("Engine");
        train.addCompartment("S1");
        train.addCompartment("S2");
        train.addCompartment("Pantry");
        train.addCompartment("S3");
        train.addCompartment("AC1");

        // Show train in both directions
        train.traverseForward();
        train.traverseBackward();

        // Insert a new compartment
        System.out.println("\n➕ Inserting S1A after S1...");
        train.insertAfter("S1", "S1A");
        train.traverseForward();

        // Remove a compartment
        System.out.println("\n➖ Removing S2...");
        train.removeCompartment("S2");
        train.traverseForward();

        // Show adjacent compartments
        train.showAdjacent("Pantry");

        // Search for services
        System.out.println();
        train.searchCompartment("Pantry");
        train.searchCompartment("WiFi");
    }
}

