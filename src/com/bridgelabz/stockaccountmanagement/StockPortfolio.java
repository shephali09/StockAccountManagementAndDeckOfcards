package com.bridgelabz.stockaccountmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio extends Stock {

	ArrayList<Stock> stock = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	Stock stocks = new Stock();

	public void addStocks() {
		boolean addMoreStocks = true;
		while (addMoreStocks) {

			System.out.println("Enter Stock name: ");
			String stockName = scanner.nextLine();
			stocks.setStockName(stockName);

			System.out.println("Enter number of shares: ");
			int numOfShares = scanner.nextInt();
			stocks.setNumOfShares(numOfShares);

			System.out.println("Enter price per share: ");
			double pricePerShare = scanner.nextDouble();
			stocks.setPricePerShare(pricePerShare);

			stock.add(stocks);
			System.out.println("Stocks added successfully!");

			System.out.println("Do you want to add another contact? (Y/N)");
			String choice = scanner.next();
			addMoreStocks = choice.equalsIgnoreCase("Y");

		}
	}

	public void stockReport() {
		System.out.println("Stock Report: ");
		double totalvalue = 0;
		for (int i = 0; i < stock.size(); i++) {
			double value = stocks.getNumOfShares() * stocks.getPricePerShare();
			System.out.println(stocks.getStockName() + " - " + value);
			totalvalue = totalvalue + value;
		}
		System.out.println("Total value of Stock: " + totalvalue);

	}

	public static void main(String[] args) {

		StockPortfolio portfolio = new StockPortfolio();
		portfolio.addStocks();
		portfolio.stockReport();
		
		Account account = new Account(500);
		System.out.println("Initial Balance: " + account.getBalance());
		account.credit(1000);
		System.out.println("After crediting the amount: " + account.getBalance());
		account.debit(200);
		System.out.println("After debiting the amount: " + account.getBalance());
		account.debit(1100);
		System.out.println("After debiting the amount: " + account.getBalance());

	}

}
