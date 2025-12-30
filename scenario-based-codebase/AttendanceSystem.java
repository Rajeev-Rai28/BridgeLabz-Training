/* 
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;
public class AttendanceSystem{
	
	public static void main(String [] args){
	
		//creating a Scanner object
		Scanner sc = new Scanner(System.in);
	
		//initializing student names in a array
		String [] student = new String[10];
		
		System.out.println("---------------------------------");
		System.out.println("Present = p");
		System.out.println("Absent = a");
		System.out.println("---------------------------------");
		
		System.out.println();
		
		System.out.println("Enter 10 student Name");
		System.out.println();
		int present = 0;
		int absent = 0;
	
		
		int index = 0;
		for(String s : student){
			System.out.print("Enter "+(index+1)+" Student name : ");
			student[index] = sc.next();
			
			System.out.println("Student name : "+student[index]);
			System.out.print("Present or Absent : ");
			char ch = sc.next().toLowerCase().charAt(0);
			
			System.out.println();
		
			if(ch == 'p'){
				present++;
			}
			else{
				absent++;
			}
			index++;
		}
	
		
		//display result
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Total present student : "+present);
		System.out.println("Total Absent student  : "+absent);
		System.out.println("---------------------------------");
		sc.close();
	}
}