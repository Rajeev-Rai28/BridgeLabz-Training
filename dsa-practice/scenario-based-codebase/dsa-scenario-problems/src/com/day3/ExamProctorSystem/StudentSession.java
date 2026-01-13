package com.day3.ExamProctorSystem;

import java.util.HashMap;
import java.util.Stack;

public class StudentSession {

    private Stack<Integer> navigationStack;        // question navigation
    private HashMap<Integer, String> answers;      // questionId -> answer

    public StudentSession() {
        navigationStack = new Stack<>();
        answers = new HashMap<>();
    }

    // Visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Answer a question
    public void answerQuestion(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answered Q" + questionId + " = " + answer);
    }

    public Stack<Integer> getNavigationStack() {
        return navigationStack;
    }

    public HashMap<Integer, String> getAnswers() {
        return answers;
    }
}
