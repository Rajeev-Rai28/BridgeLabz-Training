// Creating Class with name Calcultor indicating the purpose is to 
//  making calculator

import java.util.Scanner;
public class Calcultor {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking a input
	System.out.print("Enter a first number : ");
	double first = sc.nextDouble();

	System.out.print("Enter a second number : ");
	double second = sc.nextDouble();

	System.out.print("Enter a Operator  ");
	String op = sc.next();

	//do a operation
	switch (op){
	    case "+":
                System.out.println("Addition "+ (first+ second));
                break;
            case "-":
                System.out.println("subtraction "+ (first - second));
                break;
            case "*":
                System.out.println("Multiplication "+ (first * second));
                break;
	    case "/":
                System.out.println("Division "+ (first / second));
                break;

            default:
                System.out.println("Invalid Operator");	
	   }
	sc.close();
	}
}