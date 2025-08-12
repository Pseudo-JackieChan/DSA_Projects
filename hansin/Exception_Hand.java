package com.hansin;

public class Exception_Hand {
	public static void main(String[] args) {
		try {
			int x=2/0;	
		} catch (ArithmeticException e) {
			System.out.println("Cannot Divide Any Number By Zero");
		}
	}

}





