package com.encapsulationAndPolymorphism;

abstract class Patient implements MedicalRecord {

    protected int patientId;
    protected String name;
    protected int age;

    private String diagnosis;          // sensitive data
    private String medicalHistory;     // sensitive data

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age);
    }

    // Encapsulated access
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}
