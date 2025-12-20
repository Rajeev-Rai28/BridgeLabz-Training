// Creating Class with name MarksAndGradeCalculation indicating the purpose is to 
// calculate the grade a

import java.util.Scanner;
public class MarksAndGradeCalculation {
	public static void main(String [] args){
	
	//creating a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Taking input 
	System.out.print("Enter your physics : ");
	int physics = sc.nextInt();
	System.out.print("Enter your chemistry : ");
	int chemistry = sc.nextInt();
	System.out.print("Enter your math : ");
	int math = sc.nextInt();

	//we calculate a percent and average marks

	int totalMarks = 300;
	int totalMarksObtained = physics + chemistry + math;
	int averageMarks = totalMarksObtained / 3;
	//double percentage = (totalMarksObtained / totalMarks)*100;
	
	if(averageMarks >= 80){
		System.out.println("Average marks : "+averageMarks+" Your grade : A Remarks : level 4, above agency-normalized standards");
	}
	else if(averageMarks <= 79 && averageMarks >= 70){
		System.out.println("Average marks : "+averageMarks+" Your grade : B Remarks : level 3, at agency-normalized standards");
	}
	else if(averageMarks <= 69 && averageMarks >= 60){
		System.out.println("Average marks : "+averageMarks+" Your grade : c Remarks : level 2, below, but approching agency-normalized standards");
	}
	else if(averageMarks <= 59 && averageMarks >= 50){
		System.out.println("Average marks : "+averageMarks+" Your grade : D Remarks : level 1, Well below agency-normalized standards");
	}
	else if(averageMarks <= 49 && averageMarks >= 40){
		System.out.println("Average marks : "+averageMarks+" Your grade : E Remarks : level 1-, too below agency-normalized standards");
	}
	else {
		System.out.println("Average marks : "+averageMarks+" Your grade : R Remarks : Remedial standards");
	}
	 
	sc.close();
	}
}
	