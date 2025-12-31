package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Patient {
    String patientName;
    ArrayList<Doctor> doctors;

    Patient(String patientName) {
        this.patientName = patientName;
        doctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void viewDoctors() {
        System.out.println(patientName + " consulted doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.doctorName);
        }
        System.out.println();
    }
}

