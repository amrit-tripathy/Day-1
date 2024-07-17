package com.Graymatter;

public class Final {

//	private final String  name="tttt";//means constant  
	
	protected String companyName;
	
	public void changeName(String name) {
//		this.name=name;
	}
	
	public final void printCompanyDetails() { //final methods cannot be overridden
		System.out.println(this.companyName);
	}
	final class inner{
		String name;
	}
	
	
}
