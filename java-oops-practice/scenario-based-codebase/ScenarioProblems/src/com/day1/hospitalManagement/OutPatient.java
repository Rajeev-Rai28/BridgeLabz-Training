package com.day1.hospitalManagement;

public class OutPatient extends Patient{

	public OutPatient(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Out-Patient: " + name);
    }

}
