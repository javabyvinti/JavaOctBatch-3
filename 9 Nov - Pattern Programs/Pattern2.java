package com.bmpl.javabasic;

/*
 A		
 AB
 ABC
 ABCD
 ABCDE
 
 
  
 */

public class Pattern2 {

	public static void main(String[] args) {
//		char value = 65;
//		
//		for(int row = value; row<=69; row++)
//		{
//			for(int column = value; column<=row; column++)
//			{
//				System.out.print((char)column);
//			}
//			System.out.println();
//		}

		for(char row = 'A' ; row<='E'; row++){
			for(char column = 'A'; column<=row; column++){
				System.out.print(column);
			}
			System.out.println();
			
		}
		
	}

}
