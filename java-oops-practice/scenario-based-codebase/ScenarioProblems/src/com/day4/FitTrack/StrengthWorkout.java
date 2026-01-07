package com.day4.FitTrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        this.type = "Strength";
        this.duration = duration;
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 5.0; // Strength burns less than cardio
        return caloriesBurned;
    }
}
