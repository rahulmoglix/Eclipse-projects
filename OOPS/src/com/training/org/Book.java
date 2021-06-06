package com.training.org;

import java.util.Scanner;

public class Book {

	private String name;
	private String author;
	private float price;
	private static int qnty;
	
	public Book(String name, String author,float price,int qnty)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qnty = qnty;
	}
	
	public void showBookDetail()
	{
		System.out.println("Book details are ");
		System.out.println("name "+name+" author "+author + " price " + price + "qty"+ qnty);
	}
	
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter name ");
		myObj.nextLine();
		String name=myObj.nextLine();
		
		System.out.println("Enter author");
		myObj.nextLine();
		String author=myObj.nextLine();
		
		System.out.println("Enter price");
		float price=myObj.nextFloat();
		
		System.out.println("Enter qty");
		int unitPrice = myObj.nextInt();
		
		Book e1=new Book(name, author, price, qnty);
		e1.showBookDetail();
	
	}

}
