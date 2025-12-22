//Write a program to find the factors of a number and perform various tasks using the factors array

import java.util.Scanner;
public class FactorCalculator{
	//Find the factors
	public static int[] findFactors(int number){
        int count = 0;
        //Count factors
        for(int i=1; i<=number; i++){
            if(number%i == 0){
                count++;
            }
        }
        //Initialize array with count
        int[] factors = new int[count];
        int index = 0;
        //Store factors in array
        for(int i=1; i<=number; i++){
            if(number%i== 0){
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
	//Greatest factor
	public static int greatestFactor(int[] factors){
		int greatest = 0;
		for(int f : factors){
			if(greatest < f){
				greatest = f;
			}
		}
		return greatest;
	}
	//Sum of factors
	public static int sumOfFactors(int[] factors){
		int sum = 0;
		for(int f : factors){
			sum += f;
		}
		return sum;
	}
	//Product of factors
	public static long productOfFactors(int[] factors){
		long product = 1;
        for (long f : factors){
            product *= f;
        }
        return product;
	}
	//Product of cube of factors
	public static long productOfCubeOfFactors(int[] factors){
		long productOfCube = 1;
        for (long f : factors){
            productOfCube *= Math.pow(f, 3);
        }
        return productOfCube;
	}
	
	
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int[] factors = findFactors(number);
		//Display the factors of the number
		for(int f : factors){
			System.out.print("The factors are: ");
			System.out.println(f+ " ");
		}
		
		
		//Display the results
		System.out.println("the greatest factor: "+ greatestFactor(factors));
		System.out.println("the sum of factors: "+ sumOfFactors(factors));
		System.out.println("the product of factors: " + productOfFactors(factors));
		System.out.println("the product Of Cube Of Factors: "+ productOfCubeOfFactors(factors));
	}
}