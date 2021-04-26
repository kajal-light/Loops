package com.kajal.loops;

//In this exercise, you have to calculate the first ‘n’ fibonacci numbers. The fibonacci series is:

//0,1,1,2,3,5,8,13,...........0,1,1,2,3,5,8,13,........... 0,1,1,2,3,5,8,13,...........

//The first two fibonacci numbers are 0 and 1. Every subsequent number in the fibonacci sequence is the sum of the previous two.

//You will be given a number n, and your code should store first n fibonacci values in the string fib. You can use the valueOf() method of string to convert int value into a string.

public class Fibonacci {

	public static void main(String[] args) {
		// initialization
		int n = 6;
		int firstnum = 0;
		int secnum = 1;
		String fib = "";
		int fibnonacci = 0;
		// for loop for set up 1st and 2nd num
		for (int c = 0; c < n; c++) {
			if (c <= 1) {
				fibnonacci = c;
				//fib += String.valueOf(fibnonacci);
			} else {

				fibnonacci = firstnum + secnum;
				firstnum = secnum;

				secnum = fibnonacci;
				//fib += String.valueOf(fibnonacci);

			}
			System.out.println(fibnonacci);

		}

	}
}