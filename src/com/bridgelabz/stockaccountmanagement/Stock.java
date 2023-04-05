package com.bridgelabz.stockaccountmanagement;

public class Stock {

	public String stockName;
	public int numOfShares;
	public double pricePerShare;

	Stock() {

	}

	public Stock(String stockName, int numOfShares, double pricePerShare) {

		this.stockName = stockName;
		this.numOfShares = numOfShares;
		this.pricePerShare = pricePerShare;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	@Override
	public String toString() {
		return "Stock [name=" + stockName + ", numOfShares=" + numOfShares + ", pricePerShare=" + pricePerShare + "]";
	}

}
