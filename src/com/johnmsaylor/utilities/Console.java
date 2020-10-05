package com.johnmsaylor.utilities;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static String readPin() {
        String pin;

        while (true) {
            System.out.println("Enter your 4-digit pin");
            pin = scanner.next();

            if (pin.length() == 4)
                break;
            System.out.println(pin.length());
            System.out.println("Must Enter a Pin that is 4 digits long");
        }

        return pin;

    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

}
