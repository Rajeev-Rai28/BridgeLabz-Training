package com.day4.FitTrack;

abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // in minutes
    protected double caloriesBurned;

    protected void logWorkout() {
        System.out.println("Workout logged internally.");
    }

    public abstract double calculateCalories();

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started.");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped.");
        logWorkout(); // internal use only
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}
