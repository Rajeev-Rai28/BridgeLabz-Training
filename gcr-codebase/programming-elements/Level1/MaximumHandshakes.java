import java.util.Scanner;
public class MaximumHandshakes {
	public static void main(String [] args) {

	//create a Scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input 
	System.out.print("Enter number of students : ");
	int numberOfStudents = sc.nextInt();

	int possibleHandshakes = (numberOfStudents * (numberOfStudents -1))/2;

	//display the result
	System.out.print("Possible handshakes : "+ possibleHandshakes);
	
	sc.close();
	}
}