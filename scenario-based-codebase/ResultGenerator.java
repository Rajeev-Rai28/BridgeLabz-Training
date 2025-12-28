/*
Raj’s Result Generator ‍
Raj runs a coaching center. He needs to generate results.
● Input 5 subject marks.
● Calculate average.
● Switch to assign grades.
● for-loop to iterate over subjects.
*/

import java.util.Scanner;
public class ResultGenerator {

    // Method to input marks
    static int[] inputMarks() {
	
		//create a scanner object
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    // Method to calculate average
    static int calculateAverage(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    // Method to assign grade
    static void assignGrade(int average) {
        switch (average / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A+");
                break;
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: Fail");
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] marks = inputMarks();
        int average = calculateAverage(marks);

        System.out.println("Average Marks: " + average);
        assignGrade(average);
    }
}

