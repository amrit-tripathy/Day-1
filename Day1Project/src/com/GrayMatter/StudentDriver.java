package com.GrayMatter;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		System.out.println(st1);
		st1.setStudName("amrit");
		st1.setId(345);
		st1.setM1(34);
		st1.setM2(45);
		st1.setM3(56);
		System.out.println(st1);
		System.out.println("using getters");
		System.out.println(st1.getId());
		System.out.println(st1.getM1());
		Student st2 = new Student("amit",234,67,78,89);
		System.out.println(st2);
		
		
		
		
		
		
		
	}

}
