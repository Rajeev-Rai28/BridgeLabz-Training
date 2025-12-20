// Creating Class with name ThreeFreinds indicating the purpose is to 
//  program to find the youngest friends and the tallest among the friends based on their heights


import java.util.Scanner;
public class ThreeFreinds {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input age and height
	System.out.print("Enter the age of Amar : ");
	int ageOfAmar = sc.nextInt();
	System.out.print("Enter the height of Amar : ");
	double heightOfAmar = sc.nextDouble();

	System.out.print("Enter the age of Akbar : ");
	int ageOfAkbar = sc.nextInt();
	System.out.print("Enter the height of Akabar : ");
	double heightOfAkbar = sc.nextDouble();

	System.out.print("Enter the age of Anthony : ");
	int ageOfAnthony = sc.nextInt();
	System.out.print("Enter the height of Anthony : ");
	double heightOfAnthony = sc.nextDouble();

	//Youngest based on age
	if(ageOfAmar < ageOfAkbar && ageOfAmar < ageOfAnthony){
	   System.out.println("Amar is youngest and age is "+ageOfAmar);
	}
	else if(ageOfAkbar < ageOfAmar && ageOfAkbar < ageOfAnthony){
	   System.out.println("Akbar is youngest and age is "+ageOfAkbar);
	}
	else{
	   System.out.println("Anthony is youngest and age is "+ageOfAnthony);
	}

	//Tallest based on height
	if(heightOfAmar > heightOfAkbar && heightOfAmar > heightOfAnthony){
	   System.out.println("Amar is Tallest and height is "+heightOfAmar);
	}
	else if(heightOfAkbar > heightOfAmar && heightOfAkbar > heightOfAnthony){
	   System.out.println("Akbar is Tallest and height is "+heightOfAkbar);
	}
	else{
	   System.out.println("Anthony is Tallest and height is "+heightOfAnthony);
	}
	
	sc.close();
	}
}



	