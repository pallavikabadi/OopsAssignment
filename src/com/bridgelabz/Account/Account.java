package com.bridgelabz.Account;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }
}
