import java.util.Scanner;

public class MaximumOfThree {

    // Method to take input from user
    static int[] takeInput(Scanner sc) {
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();

        return numbers;
    }

    // Method to calculate maximum of three numbers
    static int findMaximum(int[] numbers) {
        int max = numbers[0];

        if (numbers[1] > max) {
            max = numbers[1];
        }
        if (numbers[2] > max) {
            max = numbers[2];
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] values = takeInput(sc);
        int maxValue = findMaximum(values);

        System.out.println("Maximum number is: " + maxValue);

        sc.close();
    }
}
