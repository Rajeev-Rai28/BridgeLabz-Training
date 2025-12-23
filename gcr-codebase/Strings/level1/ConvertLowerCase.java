/* Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase.
Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. 
And finally display the result
*/

import java.util.Scanner;
public class ConvertLowerCase{

	// convert a string uppercase case to lower case using charAt
	public static String convertToLowercase(String str){
		
		String  toLowerCase = "";
		for(int i = 0; i<str.length(); i++){
			
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z'){
				char ch = str.charAt(i);
				toLowerCase += (char)(ch + 32);
			}
			else{
				toLowerCase += str.charAt(i);
			}
		}
		
		return toLowerCase;
	}
	
	//compare both strings 
	public static boolean compareBothStrings(String toLowerCase, String lowerCase){
		
		if(toLowerCase.length() == lowerCase.length()){
			for(int i = 0; i < toLowerCase.length(); i++){
				char ch1 = toLowerCase.charAt(i);
				char ch2 = lowerCase.charAt(i);
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
		
		System.out.print("Enter a upper Case text : ");
		String str = sc.nextLine();
		
		String toLowerCase = convertToLowercase(str);
		
		String lowerCase = str.toLowerCase();
		
		boolean result = compareBothStrings(toLowerCase, lowerCase);
		
		System.out.println(toLowerCase+" " + lowerCase);
		
		//display a result
		System.out.print(result);
		
		
	}
}
