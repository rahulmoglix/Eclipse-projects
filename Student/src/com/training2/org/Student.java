package com.training2.org;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	private int stdId;
	private String stdName;
	private String course;
	private int marks;
	
	public Student() {
		System.out.println("Default constructor of student is called");
		stdId=0;
		stdName="";
		course="";
		marks=0;
	}
	
	
	public Student(int stdId,String stdName,String course,int marks) {
		System.out.println("Parameterised constructor of Student is called");
		this.stdId=stdId;
		this.stdName=stdName;
		this.course=course;
		this.marks=marks;
	}
	
	
	
	public void acceptValues() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter stdId");
		stdId=input.nextInt();
		
		input.nextLine();
		System.out.println("Enter your name");
		stdName=input.nextLine();
		
		input.nextLine();
		System.out.println("Enter your course");
		course=input.nextLine();
		
		
		System.out.println("Enter marks");
		marks=input.nextInt();
	
	}
	
//	public void showStudentDetails() {
//		System.out.println("Student Details");
//		System.out.println("ID "+stdId+" Name "+stdName+"Course "+course+" Marks "+marks);
//		
//	}
//	
	
	
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", course=" + course + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
	
		ArrayList<Student> stdList=new ArrayList<>();

		char ch='Y';
		Scanner input=new Scanner(System.in);

		do {
			System.out.println("1] Add new Record\n2] Update record\n3] Delete record\n4] Display records\n\nEnter your choice\n");
			int choice=input.nextInt();

			switch(choice) {

			case 1:
				Student s1=new Student();
				s1.acceptValues();
				stdList.add(s1);
				break;

			case 2:
				Student s2=new Student(102,"MAnu","ME",596);
				stdList.set(1,s2);
				break;

			case 3:
				stdList.remove(3);
				break;
			case 4:
				for (Student student : stdList) {
					System.out.println(student);
				}
				break;

			}

			System.out.println("Do you want to conti.....");
			ch=input.next().charAt(0);
		}while(ch=='y'||ch=='Y');


		
		
		
		
		
		
		
		
		
		//user 1
//		Student s1=new Student();
//		s1.showStudentDetails();
//		System.out.println(s1);
		
		//user 2
		
//		Student s2=new Student(101,"Tanish","BE",340);
//		s2.showStudentDetails();
//		System.out.println(s2);
		
		
		
		//user 3
//		Student s3=new Student();
//		s3.acceptValues();
//		s3.showStudentDetails();
	}
}
