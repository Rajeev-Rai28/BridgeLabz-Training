import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess between min and max
    static int generateGuess(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    // Method to get user feedback
    static String getUserFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }

    // Method to update range based on feedback
    static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("high")) {
            range[1] = guess - 1;
        } else if (feedback.equals("low")) {
            range[0] = guess + 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int attempts = 0;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {
            int guess = generateGuess(min, max);
            attempts++;

            System.out.println("\nMy guess: " + guess);
            feedback = getUserFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("🎉 I guessed your number in " + attempts + " attempts!");
                break;
            } else {
                int[] range = {min, max};
                updateRange(feedback, guess, range);
                min = range[0];
                max = range[1];
            }
        }

        sc.close();
    }
}
