package com.johnmsaylor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class Account {
    private double balance;
    private String pin;
    private Client owner;
    public String id;

    public Account(double initialDeposit, Client owner) {
        this.balance = initialDeposit;
        this.owner = owner;
        this.id = Integer.toString((int) (Math.random() * 1000000000));
    }

    public void withdrawal(double amount) {
        System.out.println("Enter your Owner ID");
        var scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input == pin && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction Success - New Balance: " + balance);
        } else {
            System.out.println("Failed Transaction");
        }
    }

    public void deposit(double amount) {
        if (amount < 0 ) throw new IllegalArgumentException("must be a positive value");
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getBalance(boolean format) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        return nf.format(balance);
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return id;
    }
}
