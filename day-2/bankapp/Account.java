package com.bankapp;

public class Account {
	
	private String accno;
	private String accHolderName;
	private int pin;
	private String bankName;
	private String ifscCode;
	
	public Account(String accno, String accHolderName, int pin, String bankName, String ifscCode) {
		super();
		this.accno = accno;
		this.accHolderName = accHolderName;
		this.pin = pin;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	
	public Account() {
		super();
	}
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accHolderName=" + accHolderName + ", pin=" + pin + ", bankName="
				+ bankName + ", ifscCode=" + ifscCode + "]";
	}
	
	public void changePin(int currPin,int newPin) {
		if(this.pin==currPin) {
			this.pin=newPin;
		}
		else {
			System.out.println("pin not matching");
		}
	}
	public void withdraw(double amount) {
		System.out.println("amount withdrawn successfully");
	}

}
