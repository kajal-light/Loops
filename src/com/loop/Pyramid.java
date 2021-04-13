package com.loop;

//Write code that draws half a pyramid using the # character.

//You are given an integer variable rows as input, and you have to print the pyramid with that number of rows displaying #.

public class Pyramid {

	public static void main(String args[]) {
		int rows=5;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("# ");
			}
			System.out.println(" ");
		}

	}

}
