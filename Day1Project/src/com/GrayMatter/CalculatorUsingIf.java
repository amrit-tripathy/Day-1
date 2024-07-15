package com.GrayMatter;

import java.util.Scanner;

public class CalculatorUsingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		char op;
		System.out.println("enter 2 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("enter operand");
		op = sc.next().charAt(0);
		if(op =='+') {
			System.out.println("a+b = "+(a+b));
		}
		else if(op == '-') {
			System.out.println("a-b = "+(a-b));
		}
		else if(op == '*') {
			System.out.println("aXb = "+(a*b));
		}
		else if(op == '/') {
			System.out.println("a/b = "+(a/b));
		}
		else {
			System.out.println("invalid operator");
		}
		
		
		
	
	
	
	
	
	}

}
