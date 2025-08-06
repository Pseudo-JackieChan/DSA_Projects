package com.hansin;

public class forloop {
public static void main(String[] args) {
	int[] numbers= {10,20,30,40,50};
	String[] names= {"ALice","Witch","Sniper"};
	for(int i=0;i<numbers.length&&i<names.length;i++)
	{
		System.out.println(numbers[i]+" " +names[i]);
	}
}
}
