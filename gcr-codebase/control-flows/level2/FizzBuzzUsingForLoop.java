// Creating Class with name FizzBuzz indicating the purpose is to
// print a Fizz, Buzz, and FizzBuzz using for loop
import java.util.Scanner;
	
public class FizzBuzzUsingForLoop {
	public static void main(String [] args){
	
	//create a scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input a number
	System.out.print("Enter a Number : ");
	int number = sc.nextInt();
	
	//fulfill using for loop
	for(int i = 1; i<=number; i++){
	    if(i % 3 == 0 && i % 5 == 0){
	       System.out.println("FizzBuzz");
	       
	    }
	    else if(i % 5 == 0){
	       System.out.println("Buzz");
	    }
	    else if(i % 3 == 0){
	       System.out.println("Fizz");
	       
	    }
	    else{
	       System.out.println(i);
	    }
	}
	sc.close();
	}
}

	
	