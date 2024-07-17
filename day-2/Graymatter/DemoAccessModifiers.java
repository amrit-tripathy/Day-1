package com.Graymatter;

public class DemoAccessModifiers {

	public static void main(String[] args) {
		DemoClass dc = new DemoClass(); //default within same package
		dc.name ="amrit";
		System.out.println(dc.name);
	}
}
