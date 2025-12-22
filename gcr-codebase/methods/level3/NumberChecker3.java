import java.util.Arrays;

public class NumberChecker3 {

    /* Returns the count of digits in a number */
    public static int getDigitCount(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    /* Stores digits of a number in an array */
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    /* Reverses the digits array */
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    /* Compares two arrays */
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    /* Checks if number is palindrome */
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    /* Calculates sum of digits */
    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    /* Calculates sum of squares of digits */
    public static int getSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    /* Checks if number is Harshad number */
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = getSumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    /* Checks if number is Duck number */
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return false;
            }
        }
        return true;
    }

    /* Finds frequency of each digit using 2D array */
    public static int[][] getDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    /* Main method to test all functions */
    public static void main(String[] args) {
        int number = 2024;

        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + getDigitCount(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reverseArray(digits)));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Sum of Digits: " + getSumOfDigits(digits));
        System.out.println("Sum of Squares: " + getSumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        System.out.println("\nDigit Frequency:");
        int[][] frequency = getDigitFrequency(digits);
        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.println("Digit " + row[0] + " -> " + row[1] + " times");
            }
        }
    }
}
