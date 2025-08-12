package com.hansin;


class animal{
	public void sound() {
		System.out.println("Meow");
	}
}
class Cats extends animal{
	public void sound() {
		System.out.println("Meow");
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		animal obj=new Cats();
		obj.sound();
	}

}
