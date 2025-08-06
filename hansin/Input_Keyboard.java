package com.hansin;

import java.util.Scanner;

public class Input_Keyboard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.nextLine();
		System.out.println("Your Name Is "+name);
	}

}
