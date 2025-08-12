package com.hansin;


public class Task_4 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print("Even Values = " +arr[i]);
			}
		}
		System.out.println();
		
		
		
		int sum=0;
		int arr1[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr1[i];
		}
		System.out.println("Sum Of array="+sum);
		System.out.println();
		
		

}
}
