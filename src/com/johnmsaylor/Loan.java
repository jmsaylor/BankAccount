package com.johnmsaylor;

public class Loan extends Account {

    private void setInterest(double interest) {
        if (interest < 0 || interest > 23) throw new IllegalArgumentException("See Acceptable Rates");
        this.interest = interest;
    }

    private double interest;
    private int term;

    public Loan(float initialDeposit, Client owner, double interest, int term) {
        super(initialDeposit, owner);
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
}
