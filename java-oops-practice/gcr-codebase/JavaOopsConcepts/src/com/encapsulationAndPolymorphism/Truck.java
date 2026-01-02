package com.encapsulationAndPolymorphism;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; // extra heavy-duty charge
    }

    @Override
    public double calculateInsurance() {
        return 1500; // higher insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
