/* Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) */


//create a class DistributionOfChoclate 
import java.util.Scanner;
public class DistributionOfChoclate {

	public static int[] distributionOfChoclatesInChilds(int numberOfChocolates, int numberOfChildren){
		
		int getChoclates = numberOfChocolates / numberOfChildren;
		int remainingChoclate = numberOfChocolates % numberOfChildren;
		
		int [] arr = new int[2];
		
		arr[0] = getChoclates;
		arr[1] = remainingChoclate;
		
		return arr;
	
	}
	
	public static void main(String [] args){
		
		//create scanner object 
		Scanner sc = new Scanner(System.in);
		
		//taking input numberOfchocolates and numberOfChildren
		System.out.print("Enter a number of chocolates : ");
		int numberOfChocolates = sc.nextInt();
		
		System.out.print("Enter a number of children : ");
		int numberOfChildren = sc.nextInt();
		
		//create a DistributionOfChoclate object
		DistributionOfChoclate obj = new DistributionOfChoclate();
		int [] result = obj.distributionOfChoclatesInChilds(numberOfChocolates, numberOfChildren);
		
		//display a result
		System.out.println("total choclate is : "+numberOfChocolates+" , total children : "+numberOfChildren);
		System.out.println("Distribute choclates equally : "+result[0]+" , Remaining choclates : "+result[1]);
		
		sc.close();
	}
}
		
		
		