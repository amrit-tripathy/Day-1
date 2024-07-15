package com.GrayMatter;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter a number");
		num = sc.nextInt();
		int i=2;
		boolean flag = true;
		while(i<Math.sqrt(num)) {
			if(num%i ==0) {
				flag = false;
				break;
			}
			i++;
		}
		if(flag) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
		
		
		
		
		
	}

}
