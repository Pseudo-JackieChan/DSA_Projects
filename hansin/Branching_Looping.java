package com.hansin;

import java.util.Scanner;

public class Branching_Looping {
	public static void main(String[] args) {
		//Branching
		System.out.println("Branching Statements");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=sc.nextInt();
		if(age>=18) System.out.println("Eligible To Vote");
		else System.out.println("Not Eligible To Vote");
		
		//Looping
		System.out.println("\nLooping Statements");
		int[] even={2,9,8,7,3,4,9};
		for(int i=0;i<even.length;i++)
		{
			if(even[i]%2==0) System.out.print("Even Numbers="+even[i]);
		}
			
	}

}
