package com.hansin;

class print {
	public String InkjetPrinter(String IP) {
		return IP;
	}
	public String LaserPrinter(String LP)
	{
		return LP;
	}
}
 
public class Class_Objects {
	public static void main(String[] args) {
		print obj=new print();
		System.out.println(obj.InkjetPrinter("Hello I Am InkjetPrinter"));
		System.out.println(obj.LaserPrinter("Hello I Am LaserPrinter"));
		
	}

}
