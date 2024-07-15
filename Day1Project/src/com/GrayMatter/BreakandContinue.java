package com.GrayMatter;

import java.util.Scanner;

public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =50;
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
