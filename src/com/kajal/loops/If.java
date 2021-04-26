package com.kajal.loops;
//ven a number x, you should check whether it is even or odd.

import java.util.Scanner;

//If it is even, then store "even" in answer.

//If it is odd, then store "odd" in answer.

//Only write the code where instructed in the snippet below. The return statement and the variable to be returned are already mentioned for you. Don’t worry too much about the return statement for the moment, and just set the value of the answer correctly.

public class If {

	public static void main(String[] args) {

		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		x = sc.nextInt();
		String ans = "";
		if (x % 2 == 0) {
			ans = "even";

		} else {

			ans = "odd";
		}
		System.out.println(ans);
		sc.close();
	}

}
