package com.Graymatter;

public class DemoOnOverloading {
	//change in type of parameters
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(float f1,float f2) {
		System.out.println(f1+f2);
	}
	
	public void add(String s1,String s2) { //this whole line is signature
		System.out.println(s1+s2);
	}
	
	//change in number of parameters
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(double a ,double b,double c) {
		System.out.println(a+b+c);
	}
	//change on order of parameters
	public void add(int a,double d) {
		System.out.println(a+d);
	}
	public void add(double d,int a) {
		System.out.println(a+d);
	}
	
	public void add(Complex c1,Complex c2) {
		Complex c3 = new Complex();
		c3.imag=c1.imag+c2.imag;
		c3.real = c1.real+c2.real;
		System.out.println(c3.real +"+"+c3.imag+"i");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOnOverloading doo = new DemoOnOverloading();
		doo.add(34,56);
		doo.add(4.5f, 5.6f);
		doo.add(4, 5, 7);
		Complex c1 = new Complex(3,4);
		Complex c2 = new Complex(5,6);
		doo.add(c1, c2);
		
	}

}
