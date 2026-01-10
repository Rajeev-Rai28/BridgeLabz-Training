package com.day5.LoanBuddy;

public class LoanBuddySystem {
    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Rajeev Rai",
                720,
                45000,
                500000
        );

        // Polymorphism
        LoanApplication loan1 = new HomeLoan(applicant, 120);
        LoanApplication loan2 = new AutoLoan(applicant, 60);
        LoanApplication loan3 = new PersonalLoan(applicant, 36);

        processLoan(loan1);
        processLoan(loan2);
        processLoan(loan3);
    }

    public static void processLoan(LoanApplication loan) {
        System.out.println("\nProcessing: " + loan.getLoanType());

        if (loan.approveLoan()) {
            System.out.println("✅ Loan Approved");
            System.out.println("💰 EMI: ₹" + String.format("%.2f", loan.calculateEMI()));
        } else {
            System.out.println("❌ Loan Rejected");
        }
    }
}

