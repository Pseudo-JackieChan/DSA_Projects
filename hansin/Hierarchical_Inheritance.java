package com.hansin;
class Dad{
	public void bike() {
		System.out.println("Ninja ZX10R");
	}
	public void car() {
		System.out.println("Defender");
	}
}
class son_1 extends Dad{
	public void cycle() {
		System.out.println("Hero");
	}
}
class son_2 extends Dad{
	public void skateboard() {
		System.out.println("Yonex");
	}
}
public class Hierarchical_Inheritance {
	public static void main(String[] args) {		
		son_1 obj1 = new son_1();
		obj1.bike();
		obj1.car();
		obj1.cycle();
			}	
}