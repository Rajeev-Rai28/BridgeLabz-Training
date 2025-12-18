import java.util.*;
public class SumOfNaturalNumbersUsingForLoop {
	public static void main(String [] args){
	 
	//creating a object
	Scanner sc = new Scanner(System.in);
	//taking input
	int number = sc.nextInt();

	//check a number is natural or not
	if(number < 0){
	   System.out.println("This is not Natural Number");
	   
	}
	
	//sum using formula
	int sumUsingFormula = number * (number+1) /2;
	
	//sum using while loop
	int sumUsingLoop = 0;
	
	for(int i = number; i>0; i--){
	   sumUsingLoop += i;
	}
	if(sumUsingFormula == sumUsingLoop){
	System.out.print("Sum using formula : "+sumUsingFormula+" sum using loop : "+sumUsingLoop);
	}
	sc.close();
	}
}