package com.training.org;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		
//		String name=JOptionPane.showInputDialog("Enter your name");
//		System.out.println("Name is "+name);
//		
//		JOptionPane.showMessageDialog(null, name);
//		
//		JOptionPane.showMessageDialog(null,name, "name is",JOptionPane.INFORMATION_MESSAGE);
		
		
//		String name=System.console().readLine();
//		System.out.println("Name is "+name);
		
		
//		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//		String name=reader.readLine();
//		
//		System.out.println("Name is "+name);
//		
//		System.out.println("Hello welcome to java programming.");
//		
//		
//		Scanner myObj = new Scanner(System.setIn(in);
//		System.out.println("Enter your name");
//		String userName=myObj.nextLine();
//		
//		
//		System.out.println("UserName is "+userName);
//		
//		System.out.println("Enter your age");
//		int age=myObj.nextInt();
//		
//		System.out.println("Enter your salary");
//		double salary=myObj.nextDouble();
//		
//		System.out.println("Values are"+userName+" Age"+age+"Salary"+salary);
		
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int add = num1 + num2;
		System.out.println(add);
		
		int sub = num1 - num2;
		System.out.println(sub);
	}

}
