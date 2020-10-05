package com.johnmsaylor.account;

import com.johnmsaylor.Client;
import com.johnmsaylor.exceptions.InsufficientFundsException;

public interface Account {
    void deposit(double amt);
    void withdraw(double amt);
    double getBalance();
    Client getOwner();
    void getDetails();
}
