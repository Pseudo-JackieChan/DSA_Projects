package com.hansin;
import java.util.Scanner;

   class Task_1 {
	
	Task_1(){
		System.out.println("No value provided");
	}
	Task_1(double a){
		System.out.println(a);
	}
	
	Task_1(int a,int b){
		
		int sum=a+b;
		System.out.println("Addition Is"+ sum);
	}
	
public static void main(String[] args) {
	Task_1 obj=new Task_1();
	Task_1 obj1=new Task_1(2.4);
	Task_1 obj2=new Task_1(4,5);
	
	
}
}
