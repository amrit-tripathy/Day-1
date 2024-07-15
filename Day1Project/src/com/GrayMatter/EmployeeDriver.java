package com.GrayMatter;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();  //pointer of Employee it will store address of 
//											heap memory and object space is created in heap
		//new Employee()====jvm invokes a special constructor  default constructor
		//constructor is a special method used to create object space at runtime on heap memory
		//public 
//		emp.setDetails();
//		emp.getdetails();
		
		Employee emp1 = new Employee("Amrit",145,60000,"89898989898","amit@gmail.com");
		emp1.getdetails();
		
		
		
		
		
	}

}
