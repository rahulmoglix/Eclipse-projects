package com.training.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Invoice {

	private int id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public Invoice(int id, String desc,int qty,double unitPrice)
	{
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	public void getTotal(int qty, double unitPrice)
	{
		double total = (double)qty * unitPrice;
	}
	
	public void showInvoiceDetail()
	{
		System.out.println("Invoice details are ");
		System.out.println("id "+id+" desc "+desc + " Qty " + qty + "unitPrice"+ unitPrice);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner myObj = new Scanner(System.in);
//
//		System.out.println("Enter Id ");
//		int id=myObj.nextInt();
//		System.out.println("Enter Description");
//		myObj.nextLine();
//		String desc=myObj.nextLine();
//		System.out.println("Enter qty");
//		int qty=myObj.nextInt();
//		
//		System.out.println("Enter unitPrice");
//		double unitPrice = myObj.nextDouble();
		
//		Invoice e1=new Invoice(id,desc,qty,unitPrice);
//		e1.showInvoiceDetail();
//		
//		Invoice e1=new Invoice(101,"abc",10,100);
//		Invoice e2=new Invoice(101,"xyz",10,100);
//		Invoice e3=new Invoice(101,"pqr",10,100);
//		Invoice e4=new Invoice(101,"mno",10,100);
		
		ArrayList<Invoice> list = new ArrayList<>();
		list.add(new Invoice(101,"abc",10,100));
		list.add(new Invoice(101,"abc",10,100));
		list.add(new Invoice(101,"abc",10,100));
		list.add(new Invoice(101,"abc",10,100));
	
		for (int i = 0; i < list.size(); i++) {
//			list.showInvoiceDetail() ;
		}
	}

}
