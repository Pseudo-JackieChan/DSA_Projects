package com.hansin;

import java.util.Scanner;

public class SimpleSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int user= sc.nextInt();
		int num[]= {1,2,3,4,5};
		for(int i=0;i<num.length;i++)
		{
			if(user==num[i])
			{
				System.out.println("The Number "+num[i]+" Is Found");
			}
		}
	}

	}

