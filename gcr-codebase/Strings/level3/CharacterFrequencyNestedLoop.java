/*
Write a program to find the frequency of characters in a string
using nested loops and display the result.
*/

import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    // Method to find character frequency using nested loops
    // Returns 1D String array: "character = frequency"
    public String[] findFrequency(String text) {

        // Convert string to character array
        char[] chars = text.toCharArray();

        // Frequency array (same size as text)
        int[] freq = new int[chars.length];

        // Initialize frequency array
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
        }

        // Nested loop to find frequency
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Create result array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " = " + freq[i];
                index++;
            }
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
        CharacterFrequencyNestedLoop obj = new CharacterFrequencyNestedLoop();

        // Find frequency
        String[] result = obj.findFrequency(input);

        // Display result
        System.out.println("\nCharacter Frequency:");
        System.out.println("----------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}
