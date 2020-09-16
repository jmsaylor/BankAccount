package com.johnmsaylor.exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient Funds. Transaction Declined.");
    }
}
