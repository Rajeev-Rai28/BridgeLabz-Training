package com.encapsulationAndPolymorphism;

class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int patientId, String name, int age,
                      double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    double calculateBill() {
        return consultationFee;
    }
}

