//Write a Java program to count how many times each character appears in a given 
//string using HashMap.
package com.hansin;
import java.util.HashMap;
public class Hash_Map {
	public static void main(String[] args) {
		String input = "Hello World";
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		for (char c : input.toCharArray()) {
				charCountMap.put(c,charCountMap.getOrDefault(c, 0) + 1);
		}
		System.out.println("Character count in the string: " + charCountMap);
	}
}
