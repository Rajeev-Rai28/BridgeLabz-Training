// Creating Class with name FindGreatestFactorUsingWhileLoop indicating the purpose is to
// print a greatest factor of a number
import java.util.Scanner;
	
public class FindGreatestFactorUsingWhileLoop {
	public static void main(String [] args){
	
	//create a scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input a number
	System.out.print("Enter a Number : ");
	int number = sc.nextInt();
	
	int greatestFactor = 1;
	//checking number is positive or not
	if(number < 0){
	   System.out.println("Number is not positive ");
	}
	else{

	   //print a greatest factors number
	   int counter = number-1;
	   while(counter >= 1){
		if(number % counter == 0){
		   greatestFactor = counter;
		   break;
		}
		counter--;
	    }
	}
	System.out.println(greatestFactor);
	sc.close();
	}
}
