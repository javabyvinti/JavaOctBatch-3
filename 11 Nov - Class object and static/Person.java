package com.bmpl.javabasic;

public class Person {

	// states or characteristics
	// instance variables
	// declared outside any method or any constructor or any block
	// they can be shared globally 
	// can be called as global variables
	//instance variables and static variable have default values
	String name; // static variable
	String address;
	long phn;
	
	
	void personInput(){
		name = "Ram kumar";
		address = "Delhi";
		phn = 9843543225l;//by default --> int 
	}
	
	void personOutput(){
		System.out.println("Name = " +name);
		System.out.println("Address = " +address);
		System.out.println("Phone No. = " +phn);
	}
	
	// static fields are loaded first into memory
	public static void main(String[] args) {
	
		int value = 90; //local variable
		
		Person person = new Person();
		
		//System.out.println(person.name);
		//System.out.println(person.phn + 10);
		//System.out.println(value);
		person.personInput();
		person.personOutput();
	}

}
