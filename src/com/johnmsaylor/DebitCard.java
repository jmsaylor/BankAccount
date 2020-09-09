package com.johnmsaylor;

import java.util.List;

public class DebitCard {
    private int id;
    private List<Checking> checking;

    private List<Savings> saving;

    public DebitCard(){
        this.id = (int)(Math.random() * 1000000000);
    }

    public void addAccount(Checking account) {
        checking.add(account);
    }

    public void addAccount(Savings account) {
        saving.add(account);
    }

    public int getId() {
        return id;
    }

    public List<Checking> getChecking() {
        return checking;
    }

    public List<Savings> getSaving() {
        return saving;
    }
}
