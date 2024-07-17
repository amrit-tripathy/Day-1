package com.Graymatter;

public class DemoClass {

	public String name; //package level
	public void printName() {
		System.out.println(name);
		InnerClass ic = new InnerClass();
		ic.InnerClassName = "dhfhh";
	}
	
	public class InnerClass{
		public String InnerClassName;
		
	}
	
}
