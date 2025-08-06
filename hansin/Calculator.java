package com.hansin;

public class Calculator {
	Calculator(int a,int b) {
		int sum=a+b;
		System.out.println("Addition Is "+sum);
		
	}
	public Calculator(long a,long b) {
		long multiplication=a*b;
		System.out.println("Multtiplication "+multiplication);
		
	}
	public Calculator(double a,double b) {
		double subtraction=a-b;
		System.out.println("Subtraction Is "+subtraction);
	}
	
	public static void main(String[] args) {
		Calculator obj=new Calculator(2.5,4.6);
		
	}

}
