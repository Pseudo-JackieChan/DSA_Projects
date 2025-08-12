package com.hansin;

class Animal1{
	 void hello() {
		System.out.println("Hello");
	}
	 void how() {
		System.out.println("Bye");
	}
}
class Dog extends Animal1{
	@Override void hello()
	 {
		System.out.println("HI");
	}
	void bark() {
		System.out.println("Barking");
	}
}

public class Method_Overriding {
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.hello();
		obj.how();
		obj.bark();
	}
	
}
