package com.bridgelabz.stockaccountmanagement;

public class Account {

	double balance;

	public Account(double initialBalance) {
		balance = initialBalance;
	}

	public void credit(double amount) {
		balance = balance + amount;
	}

	public void debit(double amount) {
		if (amount > balance) {
			System.out.println("Debit amount exceeded account balance.");
		} else {
			balance = balance - amount;
		}
	}

	public double getBalance() {
		return balance;
	}

}
