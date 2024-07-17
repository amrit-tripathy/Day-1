package com.Graymatter;

import java.util.Arrays;

public class School {
	
	String schoolname;
	String address;
	Classroom cr[];
	
	public School(String schoolname, String address) {
		super();
		this.schoolname = schoolname;
		this.address = address;
		
		Classroom c1 = new Classroom(3,2);
		Classroom c2 = new Classroom(5,1);
		Classroom cr[] = new Classroom[2];
		this.cr = cr;
		cr[0]=c1;
		cr[1]=c2;
		
	}

	@Override
	public String toString() {
		return "School [schoolname=" + schoolname + ", address=" + address + ", cr=" + Arrays.toString(cr) + "]";
	}

	public School() {
		super();
	}
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("manual invoking");
		System.gc();
		
	}
	

}
