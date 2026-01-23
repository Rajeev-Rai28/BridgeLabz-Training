package com.Generics.PersonalizedMealPlanGenerator;

public class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int getDailyCalories() {
        return 1800;
    }
}