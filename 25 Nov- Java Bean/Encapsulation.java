package com.bmpl.javabasic;

public class Encapsulation {

	private String name;
	private int rollno;
	private long phn;
	
	//Encapsulation --> wrapping up of data 
	// into single unit. eg--> class, functions, car, laptop, atm, etc.
	
	//Good Encapsulation --> private instance variables
	// methods as public--> inside or outside package--> accessible from anywhere
	// input or output --> setters--> to set value and
	// getters --> to get value
	
	//private --> inside the class
	//protected --> outside through inheritance
	//default --> inside package
	//public --> inside and outside package
	
	public static void main(String[] args) {
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}

}
