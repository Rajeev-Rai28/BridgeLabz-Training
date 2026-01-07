package com.day4.EventEaseApplication;

import java.util.ArrayList;

public class EventEaseApp {

    public static void main(String[] args) {

        User u1 = new User(1, "Rajeev", "rajeev@gmail.com");

        ArrayList<Event> events = new ArrayList<>();

        // Polymorphism
        Event e1 = new BirthdayEvent(101, "Amit's Birthday", "Bhopal", "10-Feb-2026", 50, u1, 3000, 500);
        Event e2 = new ConferenceEvent(102, "Tech Conference", "Indore", "20-Mar-2026", 200, u1, 10000, 2000);

        events.add(e1);
        events.add(e2);

        for (Event e : events) {
            e.showEventDetails();
            e.eventType();
            e.schedule();
            e.reschedule("01-Apr-2026");
            System.out.println("--------------------------");
        }
    }
}

