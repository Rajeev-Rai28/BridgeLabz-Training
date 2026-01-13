package com.day3.ExamProctorSystem;

public class ExamProctorApp {
	 public static void main(String[] args) {

	        // Create exam system
	        ExamProctor exam = new ExamProctor();

	        // Add questions & correct answers
	        exam.addQuestion(1, "A");
	        exam.addQuestion(2, "B");
	        exam.addQuestion(3, "C");
	        exam.addQuestion(4, "D");

	        // Start student session
	        StudentSession session = new StudentSession();

	        // Student navigates questions
	        session.visitQuestion(1);
	        session.visitQuestion(2);
	        session.visitQuestion(3);
	        session.visitQuestion(2); // revisits
	        session.visitQuestion(4);

	        // Student answers
	        session.answerQuestion(1, "A");
	        session.answerQuestion(2, "B");
	        session.answerQuestion(3, "A"); // wrong
	        session.answerQuestion(4, "D");

	        // Show navigation
	        exam.showNavigationHistory(session);

	        // Submit exam
	        int score = exam.evaluate(session);

	        System.out.println("\nFinal Score = " + score);
	    }
}
