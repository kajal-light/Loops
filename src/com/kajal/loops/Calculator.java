package com.kajal.loops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		float a,b,res;
		char choice,ch;
		
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println("1.for add\n");
			System.out.println("2.for sub\n");
			System.out.println("3.for mul\n");
			System.out.println("4.for div\n");
			System.out.println("5.for mod\n");
			System.out.println("enter your choice:");
			
			choice=sc.next().charAt(0);
			switch(choice) {
			case '1':System.out.println("enter two num");
			a=sc.nextFloat();
			
			b=sc.nextFloat();
			res=a+b;
			System.out.println(res);
			break;
			case '2':System.out.println("enter two num");
a=sc.nextFloat();
			
			b=sc.nextFloat();
			res=a-b;
			System.out.println(res);
			break;
			
			case '3':System.out.println("enter two num");
a=sc.nextFloat();
			
			b=sc.nextFloat();
			res=a*b;
			System.out.println(res);
			break;
			
			case '4':System.out.println("enter two num");
a=sc.nextFloat();
			
			b=sc.nextFloat();
			res=a/b;
			System.out.println(res);
			break;
			
			case '5':System.out.println("enter two num");
a=sc.nextFloat();
			
			b=sc.nextFloat();
			res=a%b;
			System.out.println(res);
			break;
			
			
			
			}
			System.out.println("\n--------------------");
		}while(choice>5);
	}

}
