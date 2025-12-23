/*
Write a program to find vowels and consonants in a string
and display the character type - Vowel, Consonant, or Not a Letter.
*/

import java.util.Scanner;

public class CharacterTypeCheck {

    // Method to check character type
    // Returns: "Vowel", "Consonant", or "Not a Letter"
    public String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find character type for each character
    // Returns 2D array: [character][type]
    public String[][] findCharacterTypes(String str) {

        int length = 0;

        // Find length without using length()
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // Index out of range
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public void displayResult(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("---------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        CharacterTypeCheck obj = new CharacterTypeCheck();

        // Find character types
        String[][] result = obj.findCharacterTypes(input);

        // Display result
        obj.displayResult(result);

        sc.close();
    }
}
