package com.bridgelabz.StockAccountManagement;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio();

        for (int i = 0; i < numStocks; i++) {
            System.out.println("Enter details of stock " + (i+1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Shares: ");
            int shares = scanner.nextInt();
            System.out.print("Price: $");
            double price = scanner.nextDouble();

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
    }
}
