package com.hansin;

class Person{
	public void roll() {
		System.out.println("Single Inheritance");
	}
}

class Student0 extends Person{
}



public class Single_Inheritance {
	
	public static void main(String[] args) {
		Student0 obj = new Student0();
		obj.roll();
	}
}