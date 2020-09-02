package com.johnmsaylor;

public class Main {

    public static void main(String[] args) {
     var checking = new Checking(100, 111);
     var savings = new Savings(100, 222);
     var investment = new Investment(100,333, 1);
     var loan = new Loan(100_000,4444,20.1,20);

//        System.out.println(checking.interest);
//        System.out.println(savings.interest);
//        System.out.println(investment.calculateChange(120));
//        System.out.println(investment.calculateChange((float) 122.2));
        System.out.println(checking.getBalance());
        loan.showPaymentSchedule();
    }
}
