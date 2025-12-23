/*
Write a program to find the frequency of characters
in a string using charAt() method.
*/

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequencies
    // Returns 2D array: [character][frequency]
    public String[][] findCharacterFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        int index = 0;

        // Count frequency of each character
        try {
            while (true) {
                char ch = text.charAt(index);
                freq[ch]++;
                index++;
            }
        } catch (Exception e) {
            // End of string
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array for result
        String[][] result = new String[uniqueCount][2];

        int pos = 0;

        // Store character and frequency
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[pos][0] = String.valueOf((char) i);
                result[pos][1] = String.valueOf(freq[i]);
                pos++;
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
        CharacterFrequency obj = new CharacterFrequency();

        // Find character frequencies
        String[][] frequencyData = obj.findCharacterFrequency(input);

        // Display result
        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(
                frequencyData[i][0] + "\t\t" +
                Integer.parseInt(frequencyData[i][1])
            );
        }

        sc.close();
    }
}
