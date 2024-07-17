package com.bankapp;

public class SavingsAccount extends Account {

	private double balance;
	
	@Override
	public void withdraw(double amount) {
		if(amount<this.balance) {
			this.balance = this.balance - amount;
			System.out.println("amount withdrawn successfully");
		}
	}
	
}
