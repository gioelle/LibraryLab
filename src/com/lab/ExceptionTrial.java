package com.lab;

import java.util.Scanner;


public class ExceptionTrial {
	
	public static void main(String[] args){
			
		System.out.println("Enter your age");
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		
		//checks whether an input is greater than zero. 
		//While it's not it loops through to capture a positive integer
		
		while(isValid(input.nextLine() ) < 0){
			System.out.println("Invalid Input : " + line);
			System.out.println("Please try again");
			input = new Scanner(System.in);
			line = input.nextLine();
		}
		
		int age = Integer.parseInt(input.next());
		System.out.print(age);
		
		age = Integer.parseInt(input.next());
	}
	
	public static int isValid(String input){
		int x = 0;
		try{
		x = Integer.parseInt(input);
			return x;
		}catch(NumberFormatException ex){
			return -1;
		}
		
	}
}
