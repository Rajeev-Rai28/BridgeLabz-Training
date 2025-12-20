/* Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
*/

public class SamAverageMarks {
	public static void main(String [] args) {
	
	//predifine input 
	int physics = 95;
	int chemistry = 96;
	int math = 94;

	//calculate a average marks
	int averageMarks = (physics + chemistry + math)/3;
	
	//display a average marks
	System.out.println("Sam average mark in PCM is "+ averageMarks);
	
	}
}
	