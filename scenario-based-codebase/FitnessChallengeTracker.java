/*13. Sandeep’s Fitness Challenge Tracker 
Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.*/

import java.util.Scanner;
public class FitnessChallengeTracker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double average = 0.0;
		int restDays = 0;
		System.out.println("     Sandeep Fitness Tracker");
		System.out.println("+--------------------------------+");
		System.out.println();
		
		int index=0;
		int[] pushUps = new int[7];
		for(int p : pushUps){
			System.out.print(" Enter push-ups for day "+(index+1)+" : ");
			int countPushUps = sc.nextInt();
			total += countPushUps;
			index++;
			if(countPushUps == 0){
				restDays++;
				continue;
			}
		}
		average = total/(7-restDays);
		
		System.out.println("+--------------------------------+");
		System.out.println(" Total push-ups: \t"+ total);
		System.out.println(" Average push-ups: \t"+ average);
		System.out.println("+--------------------------------+");
	}
}