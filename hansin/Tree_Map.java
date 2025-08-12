//Write a Java program to demonstrate TreeMap to store sorted student names with 
//their marks.
package com.hansin;
import java.util.TreeMap;
public class Tree_Map {
	public static void main(String[] args) {
		TreeMap<String,Integer> Marks = new TreeMap<>();
		Marks.put("Hansin Shah", 100);
		Marks.put("Akshay Bhatt", 100);
		Marks.put("Nitin Pandey", 100);
		Marks.put("Darshan Jadhav", 100);
		Marks.put("Tanmay Patil", 100);
		System.out.println("Sorted Student Names with Marks: " +Marks);
	}
}