package com.day8.BudgetWise;


import java.util.*;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 5000.0);
        limits.put("Travel", 3000.0);

        Budget monthly = new MonthlyBudget(20000, limits);

        monthly.addTransaction(new Transaction(2000, "EXPENSE", "Food"));
        monthly.addTransaction(new Transaction(3500, "EXPENSE", "Travel"));
        monthly.addTransaction(new Transaction(1000, "EXPENSE", "Food"));

        monthly.generateReport();
        monthly.detectOverspend();
    }
}
