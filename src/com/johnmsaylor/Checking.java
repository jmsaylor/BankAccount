package com.johnmsaylor;

public class Checking extends Account {

    private int interest;
    public DebitCard debitCard;

    public Checking(int initialDeposit, Client owner) {
        super(initialDeposit, owner);
        this.interest = 60;
        this.debitCard = new DebitCard();
    }

}
