package com.kajal.loops;


/*Armstrong number is a number that is equal to the sum of cubes of its digits.
 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
*/
public class Armstrong {

	public static void main(String[] args) {

		int c = 0, a, temp;
		int n = 153;
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");

	}

}
