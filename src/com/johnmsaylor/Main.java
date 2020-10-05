package com.johnmsaylor;

import com.johnmsaylor.account.Checking;
import com.johnmsaylor.account.Investment;
import com.johnmsaylor.account.Loan;
import com.johnmsaylor.account.Savings;
import com.johnmsaylor.exceptions.AccountException;

public class Main {

    public static void main(String[] args) {
        var client = new Client("John", 3,18, 1987);
        var acct = new Checking(100, client);
        var acct2 = new Savings(100, client);
        var acct3 = new Investment(200000,client,"HIGH");
        var acct4 = new Loan(500000,client,6.0,20);

        for (var account : client.getAccounts()) {
            account.deposit(100);
        }

        client.showAccounts();


    }
}
