package com.training2.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	private int empID;
	private String name;
	private double salary;
	
	
	public Employee() {
		empID=0;
		name = "";
		salary=0.0;
	}
	
	public Employee(int empID, String name,double salary) {
		this.empID = empID;
		this.name = name;
		this.salary =  salary;
	}
	
	public void acceptValues() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter empId");
		empID=input.nextInt();
		
		input.nextLine();
		System.out.println("Enter your name");
		name=input.nextLine();
		
		input.nextLine();
		System.out.println("Enter your salary");
		salary=input.nextDouble();
		
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}

	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList();
		
//		list.add(new Employee(101,"Ram", 1000));
		
		char ch='Y';
		Scanner input=new Scanner(System.in);

		do {
			System.out.println("1] Add new Record\n2] Update record\n3] Delete record\n4] Display records\n\nEnter your choice\n");
			int choice=input.nextInt();

			switch(choice) {

			case 1:
				Employee e1=new Employee();
				e1.acceptValues();
				list.add(e1);
				break;

			case 2:
				Employee e2=new Employee(102,"Ram",596.35);
				list.set(1,e2);
				break;

			case 3:
				list.remove(3);
				break;
			case 4:
				for (Employee student : list) {
					System.out.println(student);
				}
				break;

			}

			System.out.println("Do you want to conti.....");
			ch=input.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		

	}

}
