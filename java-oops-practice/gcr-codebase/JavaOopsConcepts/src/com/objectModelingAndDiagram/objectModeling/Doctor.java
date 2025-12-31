package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Doctor {
    String doctorName;
    String specialization;
    ArrayList<Patient> patients;

    Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    // Communication method
    void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);   // Association (bi-directional)

        System.out.println("Consultation:");
        System.out.println("Dr. " + doctorName + " (" + specialization +
                           ") is consulting patient " + patient.patientName);
        System.out.println();
    }

    void viewPatients() {
        System.out.println("Dr. " + doctorName + " consulted patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.patientName);
        }
        System.out.println();
    }
}

