package com.hansin;

public class MergeArray {
	public static void main(String[] args) {
		int a[]= {1,2};
		int b[]= {3,4};
		int merge[]= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
			merge[i]=a[i];
		
		for(int i=0;i<b.length;i++) 
			merge[i+a.length]=b[i];
		
		for(int i=0;i<merge.length;i++) 
			System.out.println(merge[i]);
	}

}
