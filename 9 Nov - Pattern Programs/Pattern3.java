package com.bmpl.javabasic;

/*
     1
    12 
   123
  1234
 12345
 
*/ 

public class Pattern3 {

	public static void main(String[] args) {
	
		for(int row = 1; row<=5; row++){
			
			for(int space = 5; space>row; space--){
				System.out.print(" ");
			}
			for(int column = 1; column<=row; column++){
				System.out.print(column);
			}
			System.out.println();
		}
		
	}

}
