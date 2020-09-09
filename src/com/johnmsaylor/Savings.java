package com.johnmsaylor;

public class Savings extends Account {

    private int interest;

    public Savings(int initialDeposit, int owner) {
        super(initialDeposit, owner);
        this.interest = 360;
    }
}
