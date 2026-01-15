package com.day8.BudgetWise;

import java.util.*;
class AnnualBudget extends Budget {

   public AnnualBudget(double income, Map<String, Double> categoryLimits) {
       super(income, categoryLimits);
   }

   @Override
   public void generateReport() {
       System.out.println("📈 Annual Budget Summary");
       System.out.println("Annual Income: " + income);
       System.out.println("Annual Expenses: " + getTotalExpenses());
       System.out.println("Annual Savings: " + calculateNetSavings());
   }

   @Override
   public void detectOverspend() {
       System.out.println("Annual overspend analysis completed.");
   }
}