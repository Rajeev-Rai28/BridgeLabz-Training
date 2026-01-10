package com.day5.LoanBuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.5, "Auto Loan");  // higher interest
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 20000) {
            setLoanApproved(true);
            return true;
        } else {
            setLoanApproved(false);
            return false;
        }
    }
}
