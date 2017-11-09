package com.bmpl.javabasic;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your character");
		char userChoice = scanner.next().toLowerCase().charAt(0);
		//String data = "User Data";
		
		switch(userChoice){
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		
		default:
			System.out.println("Consonant");
			break;
			
		}
		
	}

}
