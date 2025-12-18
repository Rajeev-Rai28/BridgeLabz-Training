import java.util.Scanner;
public class SumofNumbers{
	public static void main(String [] args){
	
	//create a Scanner object
	Scanner sc = new Scanner(System.in);
	double total = 0.0;
	
	double value = sc.nextDouble();
	while(value != 0){
		total += value;
		value = sc.nextDouble();
	     }
	System.out.println("Total value : "+total);
	sc.close();
	}
}
	