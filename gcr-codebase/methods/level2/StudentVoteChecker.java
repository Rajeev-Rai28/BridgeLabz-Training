/* Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; else return false;
In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age, call canStudentVote() and display the result
*/

import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check whether a student can vote
    public boolean canStudentVote(int age) {

        // Validate negative age
        if (age < 0) {
            return false;
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Creating object of StudentVoteChecker class
        StudentVoteChecker checker = new StudentVoteChecker();

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to take input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Calling method to check voting eligibility
            boolean canVote = checker.canStudentVote(ages[i]);

            // Displaying result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }
		sc.close();
    }
}
