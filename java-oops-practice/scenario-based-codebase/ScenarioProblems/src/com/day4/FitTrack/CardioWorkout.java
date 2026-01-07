package com.day4.FitTrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 8.0; // Cardio burns more
        return caloriesBurned;
    }
}

