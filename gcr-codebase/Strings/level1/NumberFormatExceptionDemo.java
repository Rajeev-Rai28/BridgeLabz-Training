import java.util.Scanner;

public class NumberFormatExceptionDemo {

	// Method to generate NumberFormatException
	public static void generateException(String text) {

		// extracting number from text
		int number = Integer.parseInt(text);
		System.out.println("Number : " + number);
	}

	// Method to handle NumberFormatException
	public static void handleException(String text) {

		try {
			// extracting number from text
			int number = Integer.parseInt(text);
			System.out.println("Number : " + number);
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException caught and handled");
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
