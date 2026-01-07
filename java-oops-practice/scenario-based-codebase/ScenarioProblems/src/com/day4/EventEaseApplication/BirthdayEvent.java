package com.day4.EventEaseApplication;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String name, String location, String date, int attendees, User organizer,
                          double servicesCost, double discount) {
        super(eventId, name, location, date, attendees, organizer, servicesCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("🎂 Birthday Party scheduled with balloons, cake and music!");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("🎂 Birthday Party rescheduled to: " + newDate);
    }

    @Override
    public void cancel() {
        isCancelled = true;
        System.out.println("🎂 Birthday Party cancelled.");
    }

    @Override
    public void eventType() {
        System.out.println("This is a Birthday Event");
    }
}
