package com.day5.LoanBuddy;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 12.5, "Personal Loan");  // highest interest
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 600 && applicant.getIncome() >= 15000) {
            setLoanApproved(true);
            return true;
        } else {
            setLoanApproved(false);
            return false;
        }
    }
}
