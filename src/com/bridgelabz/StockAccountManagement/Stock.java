package com.bridgelabz.StockAccountManagement;

public class Stock {
    private String name;
    private int shares;
    private double price;

    public Stock(String name, int shares, double price) {
        this.name = name;
        this.shares = shares;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getShares() {
        return shares;
    }

    public double getPrice() {
        return price;
    }

    public double getValue() {
        return shares * price;
    }

    @Override
    public String toString() {
        return name + " - " + shares + " shares @ $" + price + " = $" + getValue();
    }
}
