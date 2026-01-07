package com.day4.EduMentor;

public class Quiz {
    private String[] questions;
    private final String[] answers;
    public int score;
	public Quiz(String difficulty) {
		
		if(difficulty.equalsIgnoreCase("easy")) {
			questions= new String[] {"2+2?", "capital of india"};
			answers=new String [] {"4","delhi"};
		}
		else {
			questions= new String[] {"OOP Pillars?", "JVM stands for?"};
			answers=new String [] {"Encapsulation Inheritance Polymorphism Abstraction", "Java Virtual Machine"};
		}
	}
 public void submitAnswers(String[]  userAnswers) {
	 for (int i=0; i<answers.length; i++) {
		 if(userAnswers[i].equalsIgnoreCase(answers[i])) {
			 score++;
		 }
	 }
 }
 public double getPercentage() {
     return (score * 100.0) / answers.length;
}
}
