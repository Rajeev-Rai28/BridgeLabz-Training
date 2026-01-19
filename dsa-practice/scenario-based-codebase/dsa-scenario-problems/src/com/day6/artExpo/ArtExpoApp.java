package com.day6.artExpo;

public class ArtExpoApp {

    public static void main(String[] args) {

        Artist[] artists = {
            new Artist("Raj", 1030),
            new Artist("Amit", 930),
            new Artist("Neha", 1115),
            new Artist("Pooja", 1000),
            new Artist("Rohit", 945)
        };

        System.out.println("Before Sorting (Registration Order):");
        for (Artist a : artists) {
            System.out.println(a);
        }

        RegistrationManager.insertionSort(artists);

        System.out.println("\nAfter Sorting (By Registration Time):");
        for (Artist a : artists) {
            System.out.println(a);
        }
    }
}
