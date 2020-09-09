package com.johnmsaylor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public String id;
    private String pin;
    private List<Checking> checking;
    private List<Savings> saving;

    public Client(String id, String pin) {
        this.id = id;
        this.pin = pin;
        this.checking = new ArrayList<Checking>();
        this.saving = new ArrayList<Savings>();
    }

    public void addAccount(Checking account) {
      checking.add(account);
    }

    public void addAccount(Savings account) {
        saving.add(account);
    }


    public List<Checking> getChecking() {
        return checking;
    }

    public List<Savings> getSaving() {
        return saving;
    }
}
