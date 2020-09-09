package com.johnmsaylor;

public class Main {

    public static void main(String[] args) {
     var checking = new Checking(100, 111);
        var checking1 = new Checking(100, 111);
        var checking2 = new Checking(100, 111);
     var savings = new Savings(100, 222);

     var client = new Client("555-555-555", "1234");

     client.addAccount(savings);
     client.addAccount(checking);
        client.addAccount(checking1);
        client.addAccount(checking2);

     System.out.println(client.getChecking());
     System.out.println(client.getSaving());
    }
}
