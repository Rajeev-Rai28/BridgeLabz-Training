package com.day6.artExpo;

public class Artist {

    private String name;
    private int registrationTime; // e.g., 930 = 9:30 AM, 1430 = 2:30 PM

    public Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public int getRegistrationTime() {
        return registrationTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " registered at " + formatTime(registrationTime);
    }

    private String formatTime(int time) {
        int hour = time / 100;
        int min = time % 100;
        return String.format("%02d:%02d", hour, min);
    }
}
