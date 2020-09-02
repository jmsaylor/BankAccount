package com.johnmsaylor;

import java.util.Scanner;

public class Account {
    private int balance;
    private int owner;

    public Account(int initialDeposit, int owner) {
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
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
