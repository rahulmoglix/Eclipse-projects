package com.training2.org;

import java.util.ArrayList;

public class OrderDetails {
	
	private String custName;
	private String custAddress;
	private ArrayList<String> custProducts;
	private double billAmount;
	
	


	public OrderDetails() {
		System.out.println("Default constructor is called");
		custName="";
		custAddress="";
		custProducts=new ArrayList<String>();
		billAmount=0;
	}

	public OrderDetails(String custName, String custAddress, ArrayList<String> custProducts) {
		System.out.println("Parameterised constructor is called");
		this.custName = custName;
		this.custAddress = custAddress;
		this.custProducts = custProducts;
		this.billAmount =0;
	}

	
	public void generateBillAmount() {
		billAmount=1034.345;
	}

	@Override
	public String toString() {
		return "OrderDetails [custName=" + custName + ", custAddress=" + custAddress + ", custProducts=" + custProducts
				+ ", billAmount=" + billAmount + "]";
	}

	public static void main(String[] args) {
		
		
		OrderDetails o1=new OrderDetails();
		System.out.println(o1);
		
		ArrayList<String> orderColl=new ArrayList<String>();
		orderColl.add("Milk 1 ltr");
		orderColl.add("Salt 1 pkt");
		orderColl.add("Aata 10 kg");
		orderColl.add("Onion 10kg");
		
		
		
		OrderDetails o2=new OrderDetails("TAnish Mishra","Mumbai",orderColl);
		o2.generateBillAmount();
		System.out.println(o2);
				
		

	}

	
}
