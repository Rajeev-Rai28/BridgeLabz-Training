package com.day5.cinemHouse;

public class MovieShow {

    private String movieName;
    private int showTime; // e.g., 1330 = 1:30 PM

    public MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public int getShowTime() {
        return showTime;
    }

    public String getMovieName() {
        return movieName;
    }

    @Override
    public String toString() {
        return movieName + " at " + formatTime(showTime);
    }

    private String formatTime(int time) {
        int hour = time / 100;
        int min = time % 100;
        return String.format("%02d:%02d", hour, min);
    }
}
