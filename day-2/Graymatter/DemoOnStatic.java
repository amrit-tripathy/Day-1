package com.Graymatter;

public class DemoOnStatic {

	static String name;
	static {  //first priority static and JVM executes all 
		System.out.println("static block one");
	}
	static {
		System.out.println("static block2");
	}
	static {
		System.out.println("static block3");
	}
	public static void sayHello(String name) {
		this.name = name;
		System.out.println("hello"+this.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tttt");
		DemoOnStatic.sayHello("ggg");
		sayHello("amrit");
		
		
		Outer.Inner i = new Outer.Inner(); //accessing static inner class object
		i.name = "gyuiig";
	}
	static {
		System.out.println("static block4");
	}

}
