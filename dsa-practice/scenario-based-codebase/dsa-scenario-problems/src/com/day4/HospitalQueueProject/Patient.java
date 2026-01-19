package com.day4.HospitalQueueProject;

class Patient {
    String name;
    int criticality;

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        return name + " (Criticality: " + criticality + ")";
    }
}

