package com.lab;

import java.util.Scanner;

public class ExceptionTrial1 {
	public static void main(String[] args){
		System.out.println("enter your age");
		Scanner input = new Scanner(System.in);
		String inputVal = input.next();
		
		try{
		int age;
		age = Integer.parseInt(inputVal);
		} catch (NumberFormatException ex){
			System.out.println("This is not a number: " + inputVal);
		}
	}
}
