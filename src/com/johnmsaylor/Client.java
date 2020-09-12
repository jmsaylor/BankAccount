package com.johnmsaylor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Client {
    public int id;
    public String name;

    private Calendar dob;

    private List<Checking> checking;
    private List<Savings> saving;
    public Client(String name, int month, int day, int year) {
        Calendar dob = Calendar.getInstance();
        dob.set(year,(month - 1),day,0,0,0);
        this.dob = dob;
        this.id = hashCode();
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

    public Calendar getDob() {
        return dob;
    }
}
