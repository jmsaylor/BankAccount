package com.johnmsaylor;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        var john = new Client("John Saylor", 3, 18, 1986);
        Calendar date = john.getDob();
        System.out.println(date.getTime());

    }
}
