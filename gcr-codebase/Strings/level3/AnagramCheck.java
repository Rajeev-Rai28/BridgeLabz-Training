/*
Write a program to check if two texts are anagrams
and display the result.
*/

import java.util.Scanner;

public class AnagramCheck {

    // Method to find length without using length()
    public int findLength(String str) {

        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    // Method to check if two texts are anagrams
    public boolean isAnagram(String text1, String text2) {

        // Check length equality
        if (findLength(text1) != findLength(text2)) {
            return false;
        }

        // Frequency arrays for ASCII characters
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        int index = 0;

        // Find frequency of characters in first text
        try {
            while (true) {
                char ch = text1.charAt(index);
                freq1[ch]++;
                index++;
            }
        } catch (Exception e) {
            // End of first string
        }

        index = 0;

        // Find frequency of characters in second text
        try {
            while (true) {
                char ch = text2.charAt(index);
                freq2[ch]++;
                index++;
            }
        } catch (Exception e) {
            // End of second string
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Create object
        AnagramCheck obj = new AnagramCheck();

        // Check anagram
        boolean result = obj.isAnagram(text1, text2);

        // Display result
        if (result) {
            System.out.println("\nThe given texts are ANAGRAMS.");
        } else {
            System.out.println("\nThe given texts are NOT ANAGRAMS.");
        }

        sc.close();
    }
}
