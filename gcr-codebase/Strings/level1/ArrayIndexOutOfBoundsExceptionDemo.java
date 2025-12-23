import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

	// Method to generate ArrayIndexOutOfBoundsException
	public static void generateException(String[] names) {

		// Accessing index greater than array length
		System.out.println(names[names.length]);
	}

	// Method to handle ArrayIndexOutOfBoundsException
	public static void handleException(String[] names) {

		try {
			// Accessing index greater than array length
			System.out.println(names[names.length]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught and handled");
		}
		catch (RuntimeException e) {
			System.out.println("Generic RuntimeException caught");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of names : ");
		int n = sc.nextInt();
		sc.nextLine(); // consume newline

		String[] names = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name " + (i + 1) + " : ");
			names[i] = sc.nextLine();
		}

		// First call to generate the exception
		generateException(names);

		// Then call method to handle the RuntimeException
		handleException(names);
	}
}
