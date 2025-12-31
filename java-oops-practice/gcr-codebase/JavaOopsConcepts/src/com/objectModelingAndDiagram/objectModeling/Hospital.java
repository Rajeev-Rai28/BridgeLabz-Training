package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);

        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.doctorName + " (" + d.specialization + ")");
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.patientName);
        }
        System.out.println();
    }
}

