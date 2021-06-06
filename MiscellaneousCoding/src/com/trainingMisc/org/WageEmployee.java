package com.trainingMisc.org;

interface OrganizationMethods{
	public void acceptEmployeeDetails();
	public void calculateSalary();
}

class Employee implements OrganizationMethods {
	
	int empId;
	String name;
	int salary;
	
	@Override
	public void acceptEmployeeDetails() {
		
	}

	@Override
	public void calculateSalary() {
		
		
	}
	
}

public class WageEmployee extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
