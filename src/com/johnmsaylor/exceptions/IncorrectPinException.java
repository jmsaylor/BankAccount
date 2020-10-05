package com.johnmsaylor.exceptions;

public class IncorrectPinException extends Exception {
    public IncorrectPinException() {
        super("Incorrect Pin. Try Again.");
    }
}
