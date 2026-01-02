package com.encapsulationAndPolymorphism;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Car(String number, double rate, String policyNo) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance for car
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

