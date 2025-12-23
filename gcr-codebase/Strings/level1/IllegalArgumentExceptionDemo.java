import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

	// Method to generate IllegalArgumentException
	public static void generateException(String text) {

		// start index is greater than end index
		System.out.println(text.substring(5, 2));
	}

	// Method to handle IllegalArgumentException
	public static void handleException(String text) {

		try {
			// start index is greater than end index
			System.out.println(text.substring(5, 2));
		}
		catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught and handled");
		}
		catch (RuntimeException e) {
			System.out.println("Generic RuntimeException caught");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a text : ");
		String text = sc.nextLine();

		// First call to generate the exception
		generateException(text);

		// Then call method to handle the RuntimeException
		handleException(text);
	}
}
