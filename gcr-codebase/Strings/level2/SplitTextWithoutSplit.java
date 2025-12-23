/*
Write a program to split text into words without using split()
and compare the result with built-in split() method.
*/

import java.util.Scanner;

public class SplitTextWithoutSplit {

    // Method to find length of string without using length()
    public int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index goes out of range
        }
        return count;
    }

    // Method to split text into words without using split()
    public String[] splitText(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // Create array to store words
        String[] words = new String[wordCount];

        int start = 0;
        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to compare two string arrays
    public boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input using nextLine()
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Create object
        SplitTextWithoutSplit obj = new SplitTextWithoutSplit();

        // User-defined split
        String[] customSplit = obj.splitText(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        // Compare both arrays
        boolean result = obj.compareArrays(customSplit, builtInSplit);

        // Display user-defined split
        System.out.println("\nWords using user-defined method:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        // Display built-in split
        System.out.println("\nWords using built-in split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        // Display comparison result
        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}
