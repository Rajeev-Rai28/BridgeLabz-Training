import java.util.Scanner;
public class NumberChecker5{
    //Calculates the sum of proper divisors of a number
    public static int sumOfProperDivisors(int number){
        int sum = 0;
        for(int i=1; i<=number/2; i++){
            if(number%i == 0){
                sum += i;
            }
        }
        return sum;
    }
    //Check perfect number
    public static boolean isPerfect(int number){
		if(sumOfProperDivisors(number) == number){
			return true;
		}else{
			return false;
		}
    }
    //Check abundant number
    public static boolean isAbundant(int number){
		boolean result = sumOfProperDivisors(number) > number;
        return result;
    }
    //Check deficient number
    public static boolean isDeficient(int number){
		boolean result = sumOfProperDivisors(number)<number;
        return result;
    }
    //Factorial of a digit
    public static int factorial(int digit){
        int fact=1;
        for (int i=1; i<=digit; i++){
            fact*=i;
        }
        return fact;
    }
    //Check strong number
    public static boolean isStrong(int number){
        int temp=number;
        int sum=0;
        while(temp!=0){
            int digit = temp%10;
            sum+=factorial(digit);
            temp/=10;
        }
        if(sum==number){
			return true;
		}else{
			return false;
		}
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

		
		//Display the result
        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));
    }
}