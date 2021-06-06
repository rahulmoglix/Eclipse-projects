package com.training1Inheritance.org;

public class MainClass {

	public static void main(String[] args) {
//		BaseClass b1=new BaseClass();
//		b1.showBaseValues();
//		
		
		DerivedClass d1=new DerivedClass(100,200);
		d1.showBaseValues();
		d1.showDerivedValues();

	}
	
}
