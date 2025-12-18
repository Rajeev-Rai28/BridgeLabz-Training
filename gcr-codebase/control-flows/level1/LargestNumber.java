//create a largestnumber class which finds a largest number
import java.util.Scanner;

public class LargestNumber {
	public static void main(String [] args){
	
	//create a Scanner object
	Scanner sc = new Scanner(System.in);

	//taking input
	System.out.print("Enter your first number : ");
	int number1 = sc.nextInt();
	System.out.print("Enter your second number : ");
	int number2 = sc.nextInt();
	System.out.print("Enter your third number : ");
	int number3 = sc.nextInt();

	//checking which number is largest
	if((number1 > number2) && (number1 > number3)){
	   System.out.println("Is the first number the largest Yes");
	   System.out.println("Is the second number the largest No");
	   System.out.println("Is the third number the largest No");
	   
	}
	else if((number2 > number1) && (number2 > number3)){
	   System.out.println("Is the first number the largest No");
	   System.out.println("Is the second number the largest Yes");
	   System.out.println("Is the third number the largest No");
	   
	}
	else {
	   System.out.println("Is the first number the largest No");
	   System.out.println("Is the second number the largest No");
	   System.out.println("Is the third number the largest Yes");
	}

	sc.close();
	}
}

	