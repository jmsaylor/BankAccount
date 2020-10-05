package com.johnmsaylor.account;

import com.johnmsaylor.Client;
import com.johnmsaylor.DebitCard;

import java.util.UUID;

public class Checking extends AccountTemplate implements Account {

    private int interest;
    public DebitCard debitCard;

    public Checking(int initialDeposit, Client owner) {
        super(initialDeposit, "CHECKING", owner);
        this.interest = 60;
        this.debitCard = new DebitCard();
    }

    @Override
    public void deposit(double amt) {
        setBalance(getBalance() + amt);
    }

    @Override
    public void withdraw(double amt) {
        setBalance(getBalance() - amt);
    }

    @Override
    public void getDetails() {
        System.out.println(getType() + " " + getId().toString() + " " + getBalance());
    }
}
