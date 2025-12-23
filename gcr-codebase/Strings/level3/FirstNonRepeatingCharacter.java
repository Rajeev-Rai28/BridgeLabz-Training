/*
Write a program to find the first non-repeating character
in a string using charAt() method.
*/

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find first non-repeating character
    public char findFirstNonRepeatingChar(String text) {

        // Array to store frequency of ASCII characters
        int[] frequency = new int[256];

        int index = 0;

        // Find frequency of each character
        try {
            while (true) {
                char ch = text.charAt(index);
                frequency[ch]++;
                index++;
            }
        } catch (Exception e) {
            // End of string
        }

        index = 0;

        // Find first non-repeating character
        try {
            while (true) {
                char ch = text.charAt(index);
                if (frequency[ch] == 1) {
                    return ch;
                }
                index++;
            }
        } catch (Exception e) {
            // End of string
        }

        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();

        // Find first non-repeating character
        char result = obj.findFirstNonRepeatingChar(input);

        // Display result
        if (result != '\0') {
            System.out.println("\nFirst non-repeating character: " + result);
        } else {
            System.out.println("\nNo non-repeating character found.");
        }

        sc.close();
    }
}
