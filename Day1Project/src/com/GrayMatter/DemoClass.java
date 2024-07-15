package com.GrayMatter;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		boolean flag = false;
		System.out.println("num ="+num);
		System.out.println(flag);
		
		int num1 = 8;
		int num2 = 3;
		int num3 = 6;
		System.out.println("sum = "+(num1+num2));
		System.out.println("sum = "+(num1-num2));
		System.out.println("sum = "+(num1*num2));
		System.out.println("div = "+((float)num1/num2)); //(float) is explicit typecasting 
		System.out.println("sum = "+(num1%num2));
		System.out.println(num1>num2?num1:num2);
		System.out.println("ternary");
		System.out.println((num1>num2 && num1>num3)?num1:(num2>num3?num2:num3));
		System.out.println(num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3));
		//max of 4 nos and max of 5 nos suing ternary operator
		//swap 3 nos and 4 nos
		
//		swap 2 nos without temporary var
//		a = a+b
//	    b = a-b
//	    c = a-b
		
//		swap 3 nos without temporary var
//		a = a+b+c
//	    b = a-b-c
//	    c = a-b-c
//	    a = a-b-c
		
        int i = 5;int j =3;
        int x = 30;
        System.out.println(i&j);
        System.out.println(i|j);
        System.out.println("right shift by 2 "+(x>>2));
// if x = -60
// -60>>1 = -30
// -30 >> 1 = -15
// -15 >> 1 = -8       
//        
//        if x = 60
//        60>>1 = 30
//        30 >> 1 = 15
//        15 >> 1 = 7 
        
	  i=6;
	  float f = i;//widening == lower to higher ==implicit
	  
	  float f1 = 5.6f;
	  i = (int)f1; // narrowing ==higher to lower ==explicit
	  
		
	}

}
