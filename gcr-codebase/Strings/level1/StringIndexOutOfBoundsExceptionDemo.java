import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

	// Method to generate StringIndexOutOfBoundsException
	public static void generateException(String text) {

		// accessing index beyond string length
		System.out.println(text.charAt(text.length()));
	}

	// Method to handle StringIndexOutOfBoundsException
	public static void handleException(String text) {

		try {
			// accessing index beyond string length
			System.out.println(text.charAt(text.length()));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught and handled");
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
