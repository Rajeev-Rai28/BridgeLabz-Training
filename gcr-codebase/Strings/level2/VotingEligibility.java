/*
Write a program to take user input for the age of students
and check whether they can vote or not.
*/

import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public int[] generateAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // Generate random 2-digit age (10 to 99)
            ages[i] = 10 + (int) (Math.random() * 90);
        }

        return ages;
    }

    // Method to check voting eligibility
    // Returns 2D String array: [age][true/false]
    public String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];
            result[i][0] = String.valueOf(age);

            // Validate age
            if (age < 0) {
                result[i][1] = "false";
            } 
            // Check voting condition
            else if (age >= 18) {
                result[i][1] = "true";
            } 
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // Method to display result in tabular format
    public void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                Integer.parseInt(data[i][0]) + "\t" + Boolean.parseBoolean(data[i][1])
            );
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Create object
        VotingEligibility obj = new VotingEligibility();

        // Generate ages
        int[] ages = obj.generateAges(n);

        // Check voting eligibility
        String[][] result = obj.checkVotingEligibility(ages);

        // Display result
        obj.displayResult(result);

        sc.close();
    }
}
