package com.hansin;

import java.util.Scanner;

public class Task_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
			System.out.println(num1/num2);	
		} catch (Exception e) {
			System.out.println("Cannot Divide Any Number By Zero");
		}
		System.out.println("Program Ended Safely");
	}
}





