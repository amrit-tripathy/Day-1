package com.bankapp;

public class CurrAccount extends Account {

	private double overdraftLimit;

    public CurrAccount(String accountNumber, double balance, int pin, double overdraftLimit) {
        super(accountNumber, balance, pin);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds including overdraft limit.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
