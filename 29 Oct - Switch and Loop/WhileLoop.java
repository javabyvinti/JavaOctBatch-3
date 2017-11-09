package com.bmpl.javabasic;

import java.util.Scanner;

//Loop --> initialization , condition , increment or decrement



public class WhileLoop {

	public static void main(String[] args) {
		
		//while loop --> entry controlled loop 
		//do while --> 
		
		// user input and print table --> 5 X 1 = 5 .. 5 X 10 = 50 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to print table");
		
		int userChoice = scanner.nextInt();
		int i = 1;
		
		while(i<=10){
			System.out.println(userChoice + " X " + i + " = " + (userChoice *i));
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int i = 1;
//		
//		while(i<=10){ // 11<=10
//			System.out.println(i);
//			i++;
//		}
//		
//		System.out.println(i);
//		//exit
		
		
	}

}
