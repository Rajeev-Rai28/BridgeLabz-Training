package com.day5.LoanBuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term;               // in months
    protected double interestRate;    // yearly interest rate
    protected String loanType;

    private boolean loanApproved;     // PRIVATE (cannot be changed outside)

    public LoanApplication(Applicant applicant, int term, double interestRate, String loanType) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.loanType = loanType;
    }

    // EMI Formula:
    // EMI = P × R × (1+R)^N / ((1+R)^N – 1)
    public double calculateEMI() {
        double P = applicant.getLoanAmount();
        double R = (interestRate / 12) / 100;   // monthly interest
        int N = term;

        double emi = (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
        return emi;
    }

    // Internal approval logic (cannot be accessed outside)
    protected void setLoanApproved(boolean status) {
        this.loanApproved = status;
    }

    public boolean isLoanApproved() {
        return loanApproved;
    }

    public String getLoanType() {
        return loanType;
    }
}

