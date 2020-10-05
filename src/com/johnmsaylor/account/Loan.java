package com.johnmsaylor.account;

import com.johnmsaylor.Client;

public class Loan extends AccountTemplate implements Account{

    private double interest;
    private int term;

    private void setInterest(double interest) {
        if (interest < 0 || interest > 23) throw new IllegalArgumentException("See Acceptable Rates");
        this.interest = interest;
    }

    public Loan(float initialDeposit, Client owner, double interest, int term) {
        super(initialDeposit, "LOAN", owner);
        this.setInterest(interest);
        this.setTerm(term);
    }

    public void showPaymentSchedule() {
        for (int i = 0; i < term * 12; i++ ) {
            double remainder = calculateBalance((int) this.getBalance(), i,interest,term);
            System.out.println(remainder);
        }

    }

    private double calculateBalance(int principal, int month, double interest, int term) {

        interest = (interest / 100) / 12;
        term = term * 12;

        double answer = Math.pow((1 + interest), term) - Math.pow((1 + interest), month);
        answer = principal * answer;
        answer = answer / (Math.pow((1 + interest), term) - 1);

        return Math.ceil(answer);

    }


    public void setTerm(int term) {
        if (term < 0 || term > 30) throw new IllegalArgumentException("See Acceptable Loan Durations");
        this.term = term;
    }

    @Override
    public void deposit(double amt) {

    }

    @Override
    public void withdraw(double amt) {

    }

    @Override
    public void getDetails() {
        System.out.println(getType() + " " + getId() + " " + getBalance() + " " + getInterest() + " over " + getTerm() + " months");
    }

    public double getInterest() {
        return interest;
    }

    public int getTerm() {
        return term;
    }
}
