package com.day1.hospitalManagement;

public class Patient {
	protected int patientId;
	protected String name;
	private String medicalHistory;//sensitive data
	
	//Normal admission
	public Patient(int patientId, String name) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = "Not provided";
	}
	
	//Emergency admission(overloading constructor)
	public Patient(int patientId, String name, String medicalHistory) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = medicalHistory;
	}
	
	 // Encapsulation
    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }
    // Polymorphic method
    public void displayInfo() {
        System.out.println("Patient: " + name);
    }
	
}
