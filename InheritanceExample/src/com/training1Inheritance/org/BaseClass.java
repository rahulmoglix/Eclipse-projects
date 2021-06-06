package com.training1Inheritance.org;

public class BaseClass {

private int baseValue;
	
	public BaseClass() {
		System.out.println("Default constructor of BaseClass is called");
		baseValue=0;
	}

	public BaseClass(int baseValue) {
		System.out.println("Parameterised constructor of BaseClass is called");
		this.baseValue = baseValue;
	}
	
	
	public void showBaseValues() {
		System.out.println("Base values"+baseValue);
	}

}
