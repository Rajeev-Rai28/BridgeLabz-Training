import java.util.Scanner;

public class CountDownUsingForLoop {
	public static void main(String [] args){
	
	//create a Scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input
	System.out.print("Enter a count down number : ");
	int num = sc.nextInt();
	
	for(int i = num; i>=1; i--){
	    System.out.println(i);
	}
	sc.close();
	}
}

	
