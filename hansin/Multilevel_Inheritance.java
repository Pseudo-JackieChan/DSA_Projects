package com.hansin;
class Animal{
	public void eat() {
		System.out.println("Animal can eat");
	}
}
class Cat extends Animal{
	public void Meow() {
		System.out.println("Meowwwwwwwwww");
	}
}
class Kitten extends Cat{
	public void jump() {
		System.out.println("Jump like Rabbit");
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) {
		Kitten k = new Kitten();
		k.eat();
		k.Meow();
		k.jump();
	}

}