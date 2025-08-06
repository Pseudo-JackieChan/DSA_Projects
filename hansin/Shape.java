package com.hansin;

public interface Shape {
	abstract void draw();

}
class Circle implements Shape{
	public void draw() {
		System.out.println("Hello");
		
	}
}
class ATM_kotak{
	public static void main(String[] args) {
		Circle m = new Circle();
		m.draw();
	}
}