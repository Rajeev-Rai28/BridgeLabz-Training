package com.encapsulationAndPolymorphism;

class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age,
                     int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}

