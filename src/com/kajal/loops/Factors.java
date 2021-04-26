package com.kajal.loops;

import java.util.Scanner;

/*
 * @author kajal kadu
 * date: 16/03/2021
 * 
 * 
 * 

*/
/**/
public class Factors {

	public static void main(String[] args) {
		
		int factor = 0;
		
		int num=0,tem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
		
		factor=num;
		
	for(int i=(num-1);i>1;i--) {
		
		factor=factor*i;	
			
			
			
		}
System.out.println(factor);
	}

}