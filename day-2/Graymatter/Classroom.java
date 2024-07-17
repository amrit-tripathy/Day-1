package com.Graymatter;

import java.util.Arrays;

public class Classroom {

	int classNum;
	int floorNo;
	Student st[];
	public Classroom(int classNum, int floorNo,Student st[]) {
		super();
		this.classNum = classNum;
		this.floorNo = floorNo;
		this.st=st;
	}
	public Classroom() {
		super();
	}
	@Override
	public String toString() {
		return "Classroom [classNum=" + classNum + ", floorNo=" + floorNo + ", st=" + Arrays.toString(st) + "]";
	}
	public Classroom(int classNum, int floorNo) {
		super();
		this.classNum = classNum;
		this.floorNo = floorNo;
		
	}
	
}
