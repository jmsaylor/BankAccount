package com.johnmsaylor.account;

import com.johnmsaylor.Client;

import java.util.UUID;

public abstract class AccountTemplate {
    private UUID id;
    private double balance;
    private String type;
    private Client owner;

    public AccountTemplate(double initialDeposit, String type, Client owner) {
        this.id = UUID.randomUUID();
        this.owner = owner;
        this.balance = initialDeposit;
        this.type = type;
        owner.addAccount((Account) this);
    }

    public Client getOwner() {
        return owner;
    }

    public UUID getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void getDetails() {
        System.out.println(getType() + " " + getId().toString() + " " + getBalance());
    }
}
