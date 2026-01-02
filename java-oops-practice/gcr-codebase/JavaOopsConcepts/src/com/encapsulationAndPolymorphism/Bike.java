package com.encapsulationAndPolymorphism;

public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200; // lower insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

