package com.hansin;



public class String_Function {
	
	String name="Hansin";
	public void print() {
		System.out.println(name);
		System.out.println(name.concat("Shah"));
	}
	public static void main(String[] args) {
		String_Function obj=new String_Function();
		obj.print();
	}

}
