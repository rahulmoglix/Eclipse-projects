package com.training1Inheritance2.org;

public class SalesEmployee extends Employee{
	private int sales;
	private double netSalary;
	
	
	public SalesEmployee() {
		super();
		System.out.println("Default constructor of SalesEmployee is called");
		sales=0;
		netSalary=0;
	}


	public SalesEmployee(int empId,String name,double basicSalary,int sales) {
		super(empId,name,basicSalary);
		System.out.println("Parameterised constructor of SalesEmployee is called");
		this.sales = sales;
		this.netSalary = 0;
	}


	@Override
	public String toString() {
		
		return super.toString()+"\nSalesEmployee [sales=" + sales + ", netSalary=" + netSalary + "]";
	}
	
}

