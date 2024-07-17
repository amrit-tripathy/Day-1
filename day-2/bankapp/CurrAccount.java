package com.bankapp;

public class CurrAccount extends Account {

	double overDraftLimit;
	@Override
	public void withdraw(double amount) {
		if(amount<this.overDraftLimit) {
			this.overDraftLimit = this.overDraftLimit - amount;
			System.out.println("amount withdrawn successfully");
		}
	}
}
