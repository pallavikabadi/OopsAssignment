package com.bridgelabz.StockAccountManagement;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
    private List<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double totalValue = 0.0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }

    public void printReport() {
        for (Stock stock : stocks) {
            System.out.println(stock.toString());
        }
        System.out.println("Total portfolio value: $" + getTotalValue());
    }
}
