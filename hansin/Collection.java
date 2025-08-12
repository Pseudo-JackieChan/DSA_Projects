//Write a Java program to sort a list of employee names using Collections.sort().
package com.hansin;
import java.util.ArrayList;
import java.util.Collections;
	public class Collection {
		public static void main(String[] args) {
        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.add("Hansin Shah");
        employeeNames.add("Akshay Bhatt");
        employeeNames.add("Nitin Pandey");
        employeeNames.add("Darshan Jadhav");
        employeeNames.add("Tanmay Patil");

        Collections.sort(employeeNames);
        System.out.println("Sorted Employee Names:"+employeeNames);
    }
		}