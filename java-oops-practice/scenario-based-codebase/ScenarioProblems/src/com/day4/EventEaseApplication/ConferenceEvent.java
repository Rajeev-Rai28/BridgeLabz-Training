package com.day4.EventEaseApplication;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String name, String location, String date, int attendees, User organizer,
                            double servicesCost, double discount) {
        super(eventId, name, location, date, attendees, organizer, servicesCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("🏢 Conference scheduled with projector, stage and seating!");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("🏢 Conference rescheduled to: " + newDate);
    }

    @Override
    public void cancel() {
        isCancelled = true;
        System.out.println("🏢 Conference cancelled.");
    }

    @Override
    public void eventType() {
        System.out.println("This is a Conference Event");
    }
}
