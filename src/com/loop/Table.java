package com.loop;

//n this challenge, you will store all the values computed from a multiplication in the string answer. You can use the valueOf() method of string to convert int value into a string
//Inputint num = 5

 //an illustration showing what the string answer should have stored in it at the end of the while loop for the above-mentioned input.



public class Table {

	public static void main(String[] args) {
		int num=6;
		int table=0;
		String ans="";
		
		for(int i=1;i<=10;i++) {
			
			table=i*num;
			ans+=String.valueOf(table);
			
		}
System.out.println(ans);
	}

}
