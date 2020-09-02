package com.johnmsaylor;

public class Main {

    public static void main(String[] args) {
     var checking = new Checking(100, 111);
     var savings = new Savings(100, 222);
     var investment = new Investment(100,333, 1);

//        System.out.println(checking.interest);
//        System.out.println(savings.interest);
        System.out.println(investment.calculateChange(120));
    }
}
