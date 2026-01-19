package com.day5.cinemHouse;

public class CinemaHouseApp {

    public static void main(String[] args) {

        MovieShow[] shows = {
            new MovieShow("Avengers", 1830),
            new MovieShow("Inception", 1100),
            new MovieShow("Interstellar", 2100),
            new MovieShow("Batman", 1500),
            new MovieShow("Spider-Man", 1300)
        };

        System.out.println("Before Sorting (Manual Entry Order):");
        for (MovieShow s : shows) {
            System.out.println(s);
        }

        ShowManager.bubbleSort(shows);

        System.out.println("\nAfter Sorting (By Show Time):");
        for (MovieShow s : shows) {
            System.out.println(s);
        }
    }
}
