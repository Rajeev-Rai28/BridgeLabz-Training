package com.day8.BudgetWise;

import java.util.*;
class MonthlyBudget extends Budget {

   public MonthlyBudget(double income, Map<String, Double> categoryLimits) {
       super(income, categoryLimits);
   }

   @Override
   public void generateReport() {
       System.out.println("📊 Monthly Budget Report");
       System.out.println("Income: " + income);
       System.out.println("Expenses: " + getTotalExpenses());
       System.out.println("Savings: " + calculateNetSavings());
   }

   @Override
   public void detectOverspend() {
       Map<String, Double> spent = new HashMap<>();

       for (Transaction t : transactions) {
           if (t.getType().equals("EXPENSE")) {
               spent.put(
                   t.getCategory(),
                   spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
               );
           }
       }

       for (String cat : spent.keySet()) {
           if (spent.get(cat) > categoryLimits.getOrDefault(cat, Double.MAX_VALUE)) {
               System.out.println("⚠ Overspent in category: " + cat);
           }
       }
   }
}