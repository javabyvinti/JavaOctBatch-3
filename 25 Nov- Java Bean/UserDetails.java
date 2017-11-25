package com.bmpl.javabasic;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		JavaBean javaBean = new JavaBean();
		
		//String name = scanner.next();
		System.out.println("Enter your name");
		javaBean.setName(scanner.next());
		
		System.out.println("Enter your phone number");
		javaBean.setPhn(scanner.nextLong());

		//String name = javaBean.getName();
		//System.out.println("Name  = " +name);
		
		System.out.println("Name = " + javaBean.getName());
		System.out.println("Phone = " + javaBean.getPhn());
	}

}
