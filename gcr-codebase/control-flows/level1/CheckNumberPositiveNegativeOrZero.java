//create a  class which finds a number is positive, negative or zero
import java.util.Scanner;

public class CheckNumberPositiveNegativeOrZero {
	public static void main(String [] args){
	
	//create a Scanner object
	Scanner sc = new Scanner(System.in);
	//taking input
	System.out.print("Enter a number : ");
	int number = sc.nextInt();
	
	//checking a number 
	if(number > 0){
	   System.out.println("Positive");
	}
	else if(number < 0){
	    System.out.println("Negative");
	}
	else{
	    System.out.println("Zero");
	}
	sc.close();
	}
}


