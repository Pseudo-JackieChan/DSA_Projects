//Write a Java program to implement a Stack using the Stack class and perform push 
//and pop operations.
package com.hansin;
import java.util.Stack;
public class St_ack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Hansin Shah");
		stack.push("Akshay Bhatt");
		stack.push("Nitin Pandey");
		stack.push("Darshan Jadhav");
		stack.push("Tanmay Patil");
		stack.pop();
		System.out.println("Stack after pop operation: " + stack);
	}
}