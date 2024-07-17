package com.Graymatter;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		System.out.println(emp);
		
		Employee emp1 = new Employee("amrit",345,"89888888","amrit@gmail.com",
									new Date("18/10/2001"),"accounts",400000,new Date("23/6/2024"));
		
		System.out.println(emp1);
		System.out.println(emp1 instanceof Person);
		Customer cust = new Customer("amrit",345,"89888888","amrit@gmail.com",
				new Date("18/10/2001"),666666,8888);
		System.out.println(cust);
		
		
		
	}

}
