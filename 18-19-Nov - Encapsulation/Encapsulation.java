package com.bmpl.javabasic;

import java.util.Scanner;

//Encapsulation --> wrapping up of data into a single unit
// best eg--> class
// Good encapsulation--> Java Bean
// instance variables--> private
// methods			 -->  public
// getters and setters --> method --> individual field

//POJO --> Pure old java object

public class Encapsulation {


	//instance variable
	private int salary;
	private int id;
	private String name;
	private long phn;
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}


	
	/*public void input()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = scanner.nextLine();//deal with word without spaces
		//nextLine()--> sencentences or word with spaces
		System.out.println("Enter your phn");
		phn = scanner.nextLong();
		
		System.out.println("Enter your id");
		id = scanner.nextInt();
		
	}*/
	
	
/*	public Encapsulation(int salary){//param cons
		this.salary = salary;
	}*/

	/*public void print(){
		System.out.println("Name is = "+name);
		System.out.println("salary is = "+salary);
		System.out.println("id is = "+id);
		System.out.println("Phn is = "+phn);
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
