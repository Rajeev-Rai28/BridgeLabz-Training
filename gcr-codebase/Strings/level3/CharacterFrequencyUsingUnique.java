/*
Write a program to find the frequency of characters in a string
using unique characters and display the result.
*/

import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find length of string without using length()
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

    // Method to find unique characters using nested loops
    public char[] uniqueCharacters(String text) {

        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {

            char current = text.charAt(i);
            boolean isUnique = true;

            // Check with previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create exact size array
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Method to find frequency using unique characters
    // Returns 2D String array: [character][frequency]
    public String[][] findFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        int index = 0;

        // Count frequency of characters
        try {
            while (true) {
                char ch = text.charAt(index);
                freq[ch]++;
                index++;
            }
        } catch (Exception e) {
            // End of string
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create 2D array for result
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        CharacterFrequencyUsingUnique obj = new CharacterFrequencyUsingUnique();

        // Find frequency
        String[][] result = obj.findFrequency(input);

        // Display result
        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                result[i][0] + "\t\t" +
                Integer.parseInt(result[i][1])
            );
        }

        sc.close();
    }
}
