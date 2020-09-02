package com.johnmsaylor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private float balance;
    private int owner;

    public Account(float initialDeposit, int owner) {
        this.balance = initialDeposit;
        this.owner = owner;
    }

    public void withdrawal(int amount) {
        System.out.println("Enter your Owner ID");
        var scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == owner && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction Success - New Balance: " + balance);
        } else {
            System.out.println("Failed Transaction");
        }
    }

    public void deposit(int amount) {
        if (amount < 0 ) throw new IllegalArgumentException("No Hacks! - must be a positive value");
        balance += amount;
    }

    public float getBalance() {
        return balance;
    }

    public String getBalance(boolean format) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        return nf.format(balance);
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
