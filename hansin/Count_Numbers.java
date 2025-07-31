package com.hansin;

import java.util.Scanner;

public class Count_Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter Number");
		int user=sc.nextInt();
		int num[]= {1,1,2,3,3,65,6,8,65,6,83,3,3,3,3,3};
		for(int i=0;i<num.length;i++)
		{
			if(user==num[i])
			{
				count++;
			}
		}
		System.out.println("The Count = "+count);
	}

	}

