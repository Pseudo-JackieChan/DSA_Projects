package com.hansin;
	class Parent{
		void car(){
			System.out.println("BMW");
		}
	}
	class Son1 extends Parent{
		void car() {
			super.car();
			System.out.println("Mercedes");		
		}
	}
	public class Super_Final {
	public static void main(String[] args) {
		System.out.println("Super Keyword");
		Son1 obj=new Son1();
		obj.car();
		System.out.println("\nFinal Keyword");
		final int num=63;
		System.out.println(num);
		
		final StringBuilder sb = new StringBuilder("Hansin");
		 System.out.println(sb);
		 sb.append("Shah");
		 System.out.println(sb);	
	}
}
