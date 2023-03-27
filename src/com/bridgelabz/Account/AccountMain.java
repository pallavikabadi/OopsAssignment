package com.bridgelabz.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1000.0);

        System.out.println("Initial balance: " + account.getBalance());

        account.credit(500.0);
        System.out.println("Balance after credit: " + account.getBalance());

        account.debit(200.0);
        System.out.println("Balance after debit: " + account.getBalance());

        account.debit(2000.0);
        System.out.println("Balance after debit: " + account.getBalance());
    }
}
