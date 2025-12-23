/* Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. 
Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. 
And finally display the result

*/

import java.util.Scanner;
public class ConvertUpperCase{

	// conver a string lower case to uppercase using charAt
	public static String convertToUppercase(String str){
		
		String  toUpperCase = "";
		for(int i = 0; i<str.length(); i++){
			
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				char ch = str.charAt(i);
				toUpperCase += (char)(ch - 32);
			}
			else{
				toUpperCase += str.charAt(i);
			}
		}
		
		return toUpperCase;
	}
	
	//compare both strings 
	public static boolean compareBothStrings(String toUpperCase, String upperCase){
		
		if(toUpperCase.length() == upperCase.length()){
			for(int i = 0; i < toUpperCase.length(); i++){
				char ch1 = toUpperCase.charAt(i);
				char ch2 = upperCase.charAt(i);
				if(ch1 != ch2){
					return false;
				}
			}
		}
		else{
			return false;
		}
		
		return true;
	}
	
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Lower Case text : ");
		String str = sc.nextLine();
		
		String toUpperCase = convertToUppercase(str);
		
		String upperCase = str.toUpperCase();
		
		boolean check = compareBothStrings(toUpperCase, upperCase);
		
		System.out.println(toUpperCase+" " + upperCase);
		
		//display a result
		System.out.print(check);
		
		
	}
}
