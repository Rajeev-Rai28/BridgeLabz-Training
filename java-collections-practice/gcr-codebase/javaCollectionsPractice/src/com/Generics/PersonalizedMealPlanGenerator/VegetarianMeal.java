package com.Generics.PersonalizedMealPlanGenerator;

public class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int getDailyCalories() {
        return 2200;
    }
}
