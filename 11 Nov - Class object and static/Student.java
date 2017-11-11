package com.bmpl.javabasic;

public class Student {

	static int value;	// per class
	int value1; // per object
	
	void input(){
		value++;
		System.out.println(value);
		value1++;
		System.out.println(value1);
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.input();
		student2.input();
		student3.input();
		
	}

}
