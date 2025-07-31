package com.hansin;
import java.util.LinkedList;

public class SimpleLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> numbers=new LinkedList<Integer>();
		LinkedList<String> name=new LinkedList<String>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(60);
		numbers.add(50);
		System.out.println(numbers);
		
		name.add("Vitthal");
		name.add("Chetan");
		name.add("Babaji");
		System.out.println(name);
	}

}
