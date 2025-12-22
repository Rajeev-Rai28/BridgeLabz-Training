import java.util.Arrays;

public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits of a number in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if a number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    // Method to find frequency of each digit
    // 2D array: [digit][frequency]
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        // Count frequencies
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // Main method
    public static void main(String[] args) {
        int number = 21;

        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "       " + frequency[i][1]);
            }
        }
    }
}
