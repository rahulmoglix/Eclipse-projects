package com.training1Inheritance.org;

public class DerivedClass extends BaseClass {

	private int derivedValue;
	
	public DerivedClass() {
		System.out.println("Default constructor of Derived class is called");
		derivedValue=0;
	}
	
	public DerivedClass(int baseValue, int derivedValue) {
		super(baseValue);
		System.out.println("Parameterised constructor of Derived class is called");
		this.derivedValue=derivedValue;
	}
	
	
	public void showDerivedValues() {
		System.out.println("derivedVAlues "+derivedValue);
	}
	
}
