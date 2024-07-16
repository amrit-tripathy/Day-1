package com.GrayMatter;

public class AssignmentSwap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//max of 4 numbers and 5 numbers using ternary operator
		int a = 10;
        int b = 20;
        int c = 15;
        int d = 25;
        int e = 30;

        int max_value = (a > b && a > c && a > d && a > e) ? a :
                        (b > c && b > d && b > e) ? b :
                        (c > d && c > e) ? c :
                        (d > e) ? d :
                        e;

        System.out.println("Maximum value is: " + max_value);
    
	
	//one to ten 
	for (int i = 1; i <= 10; i++) {
        switch (i) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
	
	//student report
	Student s1 = new Student("amit",234,67,78,89);
	System.out.println("student name :"+ s1.getStudName());
	System.out.println("student id :"+s1.getId());
	System.out.println("student m1 marks :"+s1.getM1());
	System.out.println("student m2 marks:"+s1.getM2());
	System.out.println("student m3 marks :"+s1.getM3());
	System.out.println("student avg marks :"+s1.getavg(67, 78, 89));
	System.out.println("student grade is :"+s1.getClass(s1.getavg(67, 78, 89)));
	
	//swap 4 numbers
	int x=2,y=4,z=5,w=8;
	System.out.println("x :"+x+"y :"+y+"z :"+z+"w :"+w);
	System.out.println("swapping of 4 nos");
	x = x+y+z+w;
	y =	x-y-z-w;
	z = x-y-z-w;
	w = x-y-z-w;
	x = x-y-z-w;
	System.out.println("x :"+x+"y :"+y+"z :"+z+"w :"+w);
	
	
	
}

}
