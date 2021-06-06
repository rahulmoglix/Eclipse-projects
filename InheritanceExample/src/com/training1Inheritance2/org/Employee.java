package com.training1Inheritance2.org;

public class Employee {
	private int empId;
	private String name;
	private double basicSalary;
	
	
	public Employee() {
		System.out.println("Default constructor of Employee is called");
		empId=0;
		name="";
		basicSalary=0;
	}


	public Employee(int empId, String name, double basicSalary) {
		System.out.println("Parameterised constructor of Employee is called");
		this.empId = empId;
		this.name = name;
        
        
		this.basicSalary = basicSalary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + "]";
	}
	
}
