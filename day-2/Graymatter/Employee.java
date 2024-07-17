package com.Graymatter;

import java.util.Date;

public class Employee extends Person {
	
	private String dept;
	private double sal;
	private Date doj;
	public Employee() {
		super();
		int x =super.f();
		System.out.println(x);
	}
	public Employee(String name, int id, String mobile, String email, Date dob, String dept, double sal, Date doj) {
		super(name, id, mobile, email, dob);
		this.dept = dept;
		this.sal = sal;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", sal=" + sal + ", doj=" + doj + ", toString()=" + super.toString() + "]";
	}
	

}
