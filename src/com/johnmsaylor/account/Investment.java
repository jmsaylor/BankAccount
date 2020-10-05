package com.johnmsaylor.account;

import com.johnmsaylor.Client;

import java.text.NumberFormat;

public class Investment extends AccountTemplate implements Account {
    private String riskCategory;

    public Investment(float initialDeposit, Client client, String riskCategory) {
        super(initialDeposit, "INVESTMENT", client);
        this.riskCategory = riskCategory;
    }

    public String getRiskCategory() {
        return riskCategory;
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
    public double getBalance() {
        //shares * price?
        return super.getBalance();
    }

    @Override
    public void getDetails() {
        System.out.println(getType() + " " + getId().toString() + " " + getRiskCategory() + " " + getBalance());
    }
}
