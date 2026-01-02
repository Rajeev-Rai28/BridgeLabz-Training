package com.encapsulationAndPolymorphism;

public class HospitalPatientManagement {

    static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Bill Amount: ₹" + patient.calculateBill());
        patient.viewRecords();
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rajeev", 22, 5, 2000);
        p1.setDiagnosis("Typhoid");
        p1.addRecord("Admitted for 5 days, medication ongoing");

        Patient p2 = new OutPatient(102, "Amit", 30, 500);
        p2.setDiagnosis("Fever");
        p2.addRecord("Consultation and medicines prescribed");

        processPatient(p1);
        processPatient(p2);
    }
}
