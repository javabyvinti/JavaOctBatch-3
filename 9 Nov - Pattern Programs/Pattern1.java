package com.bmpl.javabasic;
/*

1
22
333
4444
55555

 */

public class Pattern1 {

	public static void main(String[] args) {
		for(int row = 1; row<=5; row++){
			for(int column = 1; column<=row; column++)
			{
				System.out.print(row);
			}
			System.out.println();
		}

	}

}
