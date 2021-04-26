package com.kajal.loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num=0;
		
int one;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			int counter=0;
			
			for(one=i;one>=1;one--) {
				if(i%one==0) {
					
					
					counter=counter+1;
					
				}
				
				
				
			}
			if(counter==2) {
				
				System.out.println(i + "the num is prime");
				
			}
		}

	}

}
