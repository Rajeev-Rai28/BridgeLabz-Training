//create a class Find Factorial Using While Loop
import java.util.Scanner;

public class FindFactorialUsingforLoop{
	public static void main(String [] args){
	
	//Creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number : ");
	int number = sc.nextInt();
	
	// compute the factorial
	int factorial = 1;
	
	for(int i = 1; i<=number; i++){
	      factorial *= i;
	      
	  }
	
	//display the output
	System.out.print("Factorial is : "+factorial);
	sc.close();
	}
} 