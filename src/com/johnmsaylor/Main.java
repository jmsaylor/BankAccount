package com.johnmsaylor;

public class Main {

    public static void main(String[] args) {
     var checking = new Checking(100, 111);
     var checking1 = new Checking(100, 111);
     var checking2 = new Checking(100, 111);
     var savings = new Savings(100, 222);

     var client = new Client("555-555-555", "1234");
     var client1 = new Client("444-444-444", "1234");
     var bank = new Bank();

     client.addAccount(savings);
     client.addAccount(checking);
     client1.addAccount(checking1);
     client.addAccount(checking2);

     bank.addClient(client);
     bank.addClient(client1);

     System.out.println(bank.getClients());
    }
}
