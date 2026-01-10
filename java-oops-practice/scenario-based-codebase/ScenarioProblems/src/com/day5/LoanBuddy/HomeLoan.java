package com.day5.LoanBuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5, "Home Loan");  // lower interest
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 30000) {
            setLoanApproved(true);
            return true;
        } else {
            setLoanApproved(false);
            return false;
        }
    }
}
