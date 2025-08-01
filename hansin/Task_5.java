package com.hansin;

class Employee{
	private String Employee_Name;
	private String Employee_Id;
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public String getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(String employee_Id) {
		Employee_Id = employee_Id;
	}
	public double getEmployee_Salary() {
		return Employee_Salary;
	}
	public void setEmployee_Salary(double employee_Salary) {
		Employee_Salary = employee_Salary;
	}
	private double Employee_Salary;
	
	
	}

public class Task_5 {
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEmployee_Id("AB1234");
		obj.setEmployee_Name("Hansin");
		obj.setEmployee_Salary(150000);
		
		
		System.out.println(obj.getEmployee_Id());
		System.out.println(obj.getEmployee_Name());
		System.out.println(obj.getEmployee_Salary());
	}
	

}
