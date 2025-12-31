package com.objectModelingAndDiagram.objectModeling;

public class HospitalMain {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Sharma", "Cardiologist");
        Doctor d2 = new Doctor("Mehta", "Neurologist");

        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Neha");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.showHospitalDetails();

        // Consultations (Association + Communication)
        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p2);

        // Viewing relationships
        d1.viewPatients();
        d2.viewPatients();

        p1.viewDoctors();
        p2.viewDoctors();
    }
}

