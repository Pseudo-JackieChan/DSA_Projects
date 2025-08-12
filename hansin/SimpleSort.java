package com.hansin;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleSort {
	public static void main(String[] args) {
		/*ArrayList<String>numbers=new ArrayList<String>();
		numbers.add("Hansin");
		numbers.add("Akshay");
		numbers.add("Darshan");
		numbers.add("Jawline");
		
		System.out.println("Before sort "+numbers);
		Collections.sort(numbers);
		System.out.println("After Sort " +numbers);
		Collections.reverse(numbers);
		System.out.println("Descending Order "+numbers);*/
		
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(30);
		numbers.add(90);
		numbers.add(50);
		numbers.add(574);
		
		System.out.println("Before sort "+numbers);
		Collections.sort(numbers);
		System.out.println("After Sort " +numbers);
		Collections.reverse(numbers);
		System.out.println("Descending Order "+numbers);
	}

}
