package com.day1.hospitalManagement;

public class InPatient extends Patient {
    private int numberOfDays;

    public InPatient(int id, String name, String history, int days) {
        super(id, name, history);
        this.numberOfDays = days;
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient: " + name + ", Days Admitted: " + numberOfDays);
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}

