/*
Write a program to find and return the length of a string
without using the built-in length() method.
*/

import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find string length without using length()
    public int findLength(String str) {

        int count = 0;

        try {
            // Infinite loop
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index goes out of range
        }

        return count;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Create object
        StringLengthWithoutMethod obj = new StringLengthWithoutMethod();

        // Call user-defined method
        int customLength = obj.findLength(input);

        // Built-in length method
        int builtInLength = input.length();

        // Display result
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
    }
}
