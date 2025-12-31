package com.objectModelingAndDiagram.objectModeling;

public class CompanyMain {
	 public static void main(String[] args) {

	        Company company = new Company("Tech Solutions");

	        company.addDepartment("IT");
	        company.addDepartment("HR");

	        company.addEmployeeToDepartment(0, "Raj");
	        company.addEmployeeToDepartment(0, "Amit");
	        company.addEmployeeToDepartment(1, "Neha");

	        company.displayCompany();

	        // Company object destroyed
	        company = null;

	        System.out.println("Company deleted. Departments and Employees no longer exist.");
	    }
}
