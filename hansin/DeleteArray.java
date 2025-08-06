package com.hansin;

public class DeleteArray {
	public static void main(String[] args) {
		int num[]= {10,20,30,40,50};
		int delete=3;
		for(int i=delete;i<num.length-1;i++)
		{
			num[i]=num[i+1];
		}
		for(int i=0;i<num.length-1;i++)
		{
			System.out.println(num[i]);
		}
		
	}

}
