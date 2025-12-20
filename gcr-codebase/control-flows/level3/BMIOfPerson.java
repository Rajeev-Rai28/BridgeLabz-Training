// Creating Class with name BMIOfPerson indicating the purpose is to 
// calculate the BMi

import java.util.Scanner;
public class BMIOfPerson {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input a weight and height
	System.out.print("Enter your weight in kg : ");
	double weight = sc.nextDouble();
	System.out.print("Enter your height in cm : ");
	double heightInCm = sc.nextDouble();
	
	//convert the height in cm t0 meter
	double heightInMeter = heightInCm / 100;

	//calculate a BMi
	double bmi = weight / (heightInMeter * heightInMeter);

	//display a status according to BMi
	if(bmi >= 40.0){
	   System.out.println(bmi+" Obese");
	}
	if(bmi >= 25.0 && bmi <= 39.9){
	   System.out.println(bmi+" Overweiht");
	}

	if(bmi >= 18.5 && bmi <= 24.9){
	   System.out.println(bmi+" Normal");
	}
	else{
	   System.out.println(bmi+" UnderWeight");
	}
	sc.close();
	}
}






	