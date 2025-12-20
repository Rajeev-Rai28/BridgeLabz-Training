// Create a class  DoubleOpt to perform some operations

import java.util.Scanner;
public class  DoubleOpt{
	public static void main (String[] args){
	
	// Create a scanner object for input
	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter first number : ");
	double a = sc.nextDouble();
		
	System.out.print("Enter second number : ");
		
	double b = sc.nextDouble();
		
	System.out.print("Enter third number : ");
		
	double c = sc.nextDouble();
		
	// performing operations and storing them 
		
	double ansOne =  a + b *c;
		
	double ansTwo =   a * b + c;
		
	double ansThree =  c + a / b;
		
	double ansFour = a % b + c;
		
		System.out.print(" The results of Int Operations are "+ansOne+", "+ansTwo+", "+ansThree+" and "+ansFour);
		
	sc.close();
		
		
	}
}