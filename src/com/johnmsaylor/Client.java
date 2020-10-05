package com.johnmsaylor;

import com.johnmsaylor.account.Account;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Client {
    public UUID id;
    public String name;
    private Calendar dob;
    private List<Account> accounts;


    public Client(String name, int month, int day, int year) {
        Calendar dob = Calendar.getInstance();
        dob.set(year,(month - 1),day,0,0,0);
        this.dob = dob;
        this.id = UUID.randomUUID();
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Calendar getDob() {
        return dob;
    }

    public void showAccounts() {
        for (var account : accounts) {
            account.getDetails();
        }
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
