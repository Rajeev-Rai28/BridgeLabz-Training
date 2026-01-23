package com.Collections.SetInterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InsuranceSystemMain {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();
        List<Policy> policies = new ArrayList<>();

        policies.add(new Policy("P101", "Alice",
                LocalDate.now().plusDays(10), "Health", 5000));

        policies.add(new Policy("P102", "Bob",
                LocalDate.now().plusDays(40), "Auto", 7000));

        policies.add(new Policy("P103", "Carol",
                LocalDate.now().plusDays(5), "Home", 6000));

        policies.add(new Policy("P101", "Duplicate Alice",
                LocalDate.now().plusDays(15), "Health", 5000));

        for (Policy p : policies) {
            manager.addPolicy(p);
        }

        manager.showAllPolicies();
        manager.showExpiringSoon();
        manager.showByCoverage("Health");
        manager.findDuplicates(policies);
        manager.comparePerformance(policies);
    }
}
