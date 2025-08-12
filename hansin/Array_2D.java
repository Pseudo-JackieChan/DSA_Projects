package com.hansin;

public class Array_2D {
	public static void main(String[] args) {
		String[][] chocolateBox = {
				{"a","b","c"},
				{"d","e","f"},
				{"g","h","i"}
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(chocolateBox[i][j]+" ");
			}
			System.out.println();
		}
	}

}
