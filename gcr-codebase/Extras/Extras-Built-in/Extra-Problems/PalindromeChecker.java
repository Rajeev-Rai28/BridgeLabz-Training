import java.util.Scanner;

public class PalindromeChecker {

    // Method to take string input
    static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Method to check palindrome
    static boolean isPalindrome(String str) {

        // Convert to lowercase for case-insensitive check
        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to display result
    static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a PALINDROME.");
        } else {
            System.out.println("\"" + str + "\" is NOT a palindrome.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);
        boolean isPal = isPalindrome(input);
        displayResult(input, isPal);

        sc.close();
    }
}
