package com.johnmsaylor;

import com.johnmsaylor.exceptions.InsufficientFundsException;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        var acct = new Checking(100, new Client("John", 3,18, 1987));
        acct.setPin("1111");
        try {
            acct.withdraw(101);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
