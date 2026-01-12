package com.day6.TourMate;

import java.util.List;
import java.util.ArrayList;


public class TourMateApp {
    public static void main(String[] args) {

        // Create services
        Transport flight = new Transport("Flight", 15000);
        Hotel hotel = new Hotel("Sea View Resort", 3000, 4);

        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Scuba Diving", 4000));
        activities.add(new Activity("City Tour", 2000));

        // Polymorphism
        Trip trip1 = new DomesticTrip("Goa", 4, flight, hotel, activities);
        Trip trip2 = new InternationalTrip("Paris", 5, flight, hotel, activities);

        System.out.println("---- Domestic Trip ----");
        trip1.showTripDetails();
        trip1.book();

        System.out.println("\n---- International Trip ----");
        trip2.showTripDetails();
        trip2.book();
    }
}
