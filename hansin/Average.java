package com.hansin;

public class Average {
	public static void main(String[] args) {
		double sum=0;
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Average Of array="+ sum/arr.length);
		System.out.println();
	}

}
