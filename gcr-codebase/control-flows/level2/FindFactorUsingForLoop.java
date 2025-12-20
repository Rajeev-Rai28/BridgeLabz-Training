// Creating Class with name FindFactorUsingForLoop indicating the purpose is to
// print a factor 1 to number
import java.util.Scanner;
	
public class FindFactorUsingForLoop {
	public static void main(String [] args){
	
	//create a scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input a number
	System.out.print("Enter a Number : ");
	int number = sc.nextInt();
	
	//checking number is positive or not
	if(number < 0){
	   System.out.println("Number is not positive ");
	}
	else{

	   //print factors from 1 to number
	   for(int i = 1; i < number; i++){
		if(number % i == 0){
		   System.out.println(i);
		}
	    }
	}
	sc.close();
	}
}
