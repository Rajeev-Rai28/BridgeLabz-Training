/* Problem:
Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).
*/

import java.util.Scanner;
public class Palindrom{

	public static boolean isPalindrom(String str){
		int start = 0;
		int end = str.length()-1;
		boolean check = true;
		while(start < end){
			char ch1 = str.charAt(start);
			char ch2 = str.charAt(end);
			if(ch1 != ch2){
				check = false;
				break;
			}
			start++;
			end--;
		}
		return check;
	}
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str = sc.next();
		
		boolean check = isPalindrom(str);
		
		System.out.print("String is Palindrom : "+check);
	}
}