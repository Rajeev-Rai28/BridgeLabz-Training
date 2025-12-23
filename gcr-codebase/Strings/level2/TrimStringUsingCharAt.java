/*
Write a program to trim the leading and trailing spaces from a string
using the charAt() method.
*/

import java.util.Scanner;

public class TrimStringUsingCharAt {

    // Method to find start and end index without spaces
    // Returns int array: [startIndex, endIndex]
    public int[] findTrimIndexes(String str) {

        int start = 0;
        int end = 0;

        // Find length without using length()
        try {
            while (true) {
                str.charAt(end);
                end++;
            }
        } catch (Exception e) {
            end = end - 1;
        }

        // Trim leading spaces
        while (str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public boolean compareStrings(String s1, String s2) {

        int i = 0;

        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
                i++;
            }
        } catch (Exception e) {
            // End of string reached
        }

        // Check if both strings ended at same length
        try {
            s2.charAt(i);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        // Create object
        TrimStringUsingCharAt obj = new TrimStringUsingCharAt();

        // Find trim indexes
        int[] indexes = obj.findTrimIndexes(input);

        // Create trimmed string using user-defined method
        String customTrim = obj.createSubstring(input, indexes[0], indexes[1]);

        // Trim using built-in method
        String builtInTrim = input.trim();

        // Compare both strings
        boolean result = obj.compareStrings(customTrim, builtInTrim);

        // Display result
        System.out.println("\nTrimmed String (User Method): '" + customTrim + "'");
        System.out.println("Trimmed String (Built-in)   : '" + builtInTrim + "'");
        System.out.println("Are both strings same?      : " + result);

        sc.close();
    }
}
