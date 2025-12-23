/*
Write a program to find vowels and consonants in a string
and display their count.
*/

import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check character type
    // Returns: "Vowel", "Consonant", or "Not a Letter"
    public String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    // Returns int array: [vowelCount, consonantCount]
    public int[] findVowelsAndConsonants(String str) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = str.charAt(i);
                String result = checkCharacter(ch);

                if (result.equals("Vowel")) {
                    vowels++;
                } else if (result.equals("Consonant")) {
                    consonants++;
                }

            } catch (Exception e) {
                // Exception occurs when index goes out of range
                break;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        VowelConsonantCount obj = new VowelConsonantCount();

        // Call method
        int[] result = obj.findVowelsAndConsonants(input);

        // Display result
        System.out.println("\nTotal Vowels      : " + result[0]);
        System.out.println("Total Consonants  : " + result[1]);

        sc.close();
    }
}
