/* Problem:
Write a Java program to reverse a given string without using any built-in reverse
functions. */

import java.util.Scanner;
public class ReverseString{

	public static String reverseStr(String str){
		
		String empty = "";
		for(int i = str.length()-1; i>=0; i--){
			empty += str.charAt(i);
		}
		return empty;
	}

	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str = sc.next();
		
		String reverse = reverseStr(str);
		
		System.out.print("Reverse String : "+reverse);
		
		sc.close();
	}
}