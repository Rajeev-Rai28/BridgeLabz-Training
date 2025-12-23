public class NullPointerExceptionDemo {

	// Method to generate NullPointerException
	public static void generateException() {

		String text = null;

		// This line will generate NullPointerException
		System.out.println(text.length());
	}

	// Method to handle NullPointerException
	public static void handleException() {

		String text = null;

		try {
			// Trying to access String method
			System.out.println(text.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught and handled");
		}
	}

	public static void main(String[] args) {

		// Calling method to generate exception
		generateException();

		// Refactored code to handle the RuntimeException
		handleException();
	}
}
