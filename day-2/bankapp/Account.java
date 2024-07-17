package com.bankapp;

public class Account {
	
	protected String accountNumber;
    protected double balance;
    protected int pin;

    public Account(String accountNumber, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully.");
    }

    public double getBalance() {
        return balance;
    }

}
