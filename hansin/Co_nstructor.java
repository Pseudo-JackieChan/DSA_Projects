package com.hansin;
import java.util.Scanner;

   class Co_nstructor {
	
	   Co_nstructor(){
		System.out.println("No value provided");
	}
	   Co_nstructor(double a){
		System.out.println(a);
	}
	
	   Co_nstructor(int a,int b){
		
		int sum=a+b;
		System.out.println("Addition Is "+ sum);
	}
	
public static void main(String[] args) {
	Co_nstructor obj=new Co_nstructor();
	Co_nstructor obj1=new Co_nstructor(2.4);
	Co_nstructor obj2=new Co_nstructor(4,5);
	
	
}
}
