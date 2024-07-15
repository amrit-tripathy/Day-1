package com.GrayMatter;

import java.util.Scanner;

public class Employee {

	//properties,instance variables
	String name;
	int id;
	double sal;
	String mobile;
	String email;
	static String companyName;
	
	public Employee() {
		super();
	}

	public Employee(String name, int id, double sal, String mobile, String email) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.mobile = mobile;
		this.email = email;
	}

	public void setDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter all details :");
		this.name = sc.next();
		this.id = sc.nextInt();
		this.sal = sc.nextDouble();
		this.mobile = sc.next();
		this.email = sc.next();
	}
	
	public void getdetails() {
		System.out.println(this.name+" "+this.id+" "+this.sal);
	}

}
