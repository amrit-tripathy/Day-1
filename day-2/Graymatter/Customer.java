package com.Graymatter;

import java.util.Date;

public class Customer extends Person {

	private double orderSum;
	private int ordId;
	public Customer(String name, int id, String mobile, String email, Date dob, double orderSum, int ordId) {
		super(name, id, mobile, email, dob);
		this.orderSum = orderSum;
		this.ordId = ordId;
	}
	
	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [orderSum=" + orderSum + ", ordId=" + ordId + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
