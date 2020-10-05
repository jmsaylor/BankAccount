package com.johnmsaylor.account;

import com.johnmsaylor.Client;
import com.johnmsaylor.exceptions.InsufficientFundsException;

public class Savings extends AccountTemplate implements Account {

    private int interest;
    private double withdrawFee = 2.5;

    public Savings(int initialDeposit, Client owner) {
        super(initialDeposit, "SAVINGS", owner);
        this.interest = 360;
    }

    @Override
    public void deposit(double amt) {
        setBalance(getBalance() + amt);
    }

    @Override
    public void withdraw(double amt) {
        if (amt < getBalance()) {
            setBalance(getBalance() - (amt + withdrawFee));
        }
    }

}
