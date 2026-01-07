package com.day4.EventEaseApplication;

public abstract class Event implements ISchedulable {

    private final int eventId;   // cannot be modified once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    protected User organizer;

    // Encapsulated pricing
    private double venueCost;
    private double servicesCost;
    private double discount;

    protected boolean isCancelled = false;

    // Constructor without packages
    public Event(int eventId, String eventName, String location, String date, int attendees, User organizer) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = 5000;
        this.servicesCost = 0;
        this.discount = 0;
    }

    // Constructor with packages
    public Event(int eventId, String eventName, String location, String date, int attendees, User organizer,
                 double servicesCost, double discount) {
        this(eventId, eventName, location, date, attendees, organizer);
        this.servicesCost = servicesCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        double total = venueCost + servicesCost - discount;
        if (total < 0) total = 0;
        return total;
    }

    public int getEventId() {
        return eventId;
    }

    // Encapsulated display
    public void showEventDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Organizer: " + organizer.getName());
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    // Abstract method (for polymorphism if needed)
    public abstract void eventType();
}

