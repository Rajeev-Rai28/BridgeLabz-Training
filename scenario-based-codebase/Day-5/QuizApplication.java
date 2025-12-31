/*
Online Quiz Application
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. 
● Apply clear indentation and structured layout.
*/

import java.util.Scanner;
public class QuizApplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		//Array of questions
		String[] questions = {
			" What is the capital of India?",
			" Which planet is known as the Red Planet?",
			" Who is known as the Father of the Indian Constitution?",
			" Which gas is most abundant in the Earth’s atmosphere?",
			" What is the national animal of India?"
		};
		System.out.println("\n       * Emerald Quiz *");
		System.out.println("+-----------------------------+");
		
		//Array for ooptions
		String[] options = 
			{" 1. Mumbai \n 2. Kolkata \n 3. New Delhi \n 4. Chennai",
			" 1. Earth \n 2. Venus \n 3. Jupiter \n 4. Mars",
			" 1. Mahatma Gandhi \n 2. Jawaharlal Nehru \n 3. Sardar Patel \n 4. Dr. B. R. Ambedkar",
			" 1. Oxygen \n 2. Carbon Dioxide \n 3. Hydrogen \n 4. Nitrogen",
			" 1. Lion \n 2. Elephant \n 3. Leopard \n 4. Tiger"}
		;

		//Array for correct options
		int[] correctAns = {3,4,4,4,4};
		
		//Looping till 5 questions
		for(int i=0; i<questions.length; i++){
			System.out.println("\n Question: "+ questions[i]);
			System.out.println(options[i]);
			System.out.println();
			
			System.out.print(" Choose your answer: ");
			int selectOption = sc.nextInt();
			
			//Switch for checking answers
			switch(selectOption){
				case 1:
				case 2:
				case 3:
				case 4:
					if (selectOption == correctAns[i]){
						System.out.println(" Correct answer!!");
						score += 2;
					}else{
						System.out.println(" Wrong answer.");
					}
					break;
				default :
					System.out.println(" Invalid option");
					break;
			}	
		}
		
		//Display the total score
		System.out.println("+-----------------------------+");
		System.out.println("\n Total Score is: "+ score+ " out of 10");
	}
}