package com.day3.ExamProctorSystem;

import java.util.HashMap;

public class ExamProctor {

    private HashMap<Integer, String> answerKey; // questionId -> correctAnswer

    public ExamProctor() {
        answerKey = new HashMap<>();
    }

    // Add question to answer key
    public void addQuestion(int id, String correctAnswer) {
        answerKey.put(id, correctAnswer);
    }

    // Function to evaluate score
    public int evaluate(StudentSession session) {
        int score = 0;

        HashMap<Integer, String> studentAnswers = session.getAnswers();

        for (int qid : studentAnswers.keySet()) {
            String correct = answerKey.get(qid);
            String given = studentAnswers.get(qid);

            if (correct != null && correct.equalsIgnoreCase(given)) {
                score++;
            }
        }

        return score;
    }

    // Show navigation history
    public void showNavigationHistory(StudentSession session) {
        System.out.println("\nQuestion Navigation History (Last Visited First):");

        for (int qid : session.getNavigationStack()) {
            System.out.println("Question " + qid);
        }
    }
}

