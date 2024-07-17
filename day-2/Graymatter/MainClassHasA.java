package com.Graymatter;

public class MainClassHasA {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		School sc = new School("kv","ban");
		
		Student s1 = new Student("amr",123);
		Student s2 = new Student("amrddd",167);
		Student s3 = new Student("yyy",778);
		Student st[] = {s1,s2,s3};
		Classroom c = new Classroom(7,4,st);
		System.out.println(sc);
		System.out.println(c);
		System.out.println(s1);
		
		MainClassHasA main = new MainClassHasA();
		main.finalize();

	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("manual invoking");
		System.gc();
		
	}

}
