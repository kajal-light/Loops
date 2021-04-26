package com.kajal.loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
		 while(num!=0) {
			
			
			reversenum=reversenum*10;
			
			reversenum=reversenum+num%10;
			
			 num/=10;
		 }
		
System.out.println(reversenum);
	}

}
