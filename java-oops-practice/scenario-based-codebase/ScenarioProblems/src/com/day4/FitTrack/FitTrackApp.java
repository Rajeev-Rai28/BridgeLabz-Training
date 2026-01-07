package com.day4.FitTrack;

public class FitTrackApp {
    public static void main(String[] args) {

        UserProfile user = new UserProfile("Rajeev", 22, 68.5, "Lose Weight");

        System.out.println(user.getSummary());

        // Polymorphism
        Workout w1 = new CardioWorkout(30);
        Workout w2 = new StrengthWorkout(40);

        w1.startWorkout();
        double c1 = w1.calculateCalories();
        w1.stopWorkout();

        w2.startWorkout();
        double c2 = w2.calculateCalories();
        w2.stopWorkout();

        double dailyTarget = 500;

        // Operators used
        double totalBurned = c1 + c2;
        double remaining = dailyTarget - totalBurned;

        System.out.println("Calories burned today: " + totalBurned);
        System.out.println("Remaining to reach goal: " + remaining);
    }
}
