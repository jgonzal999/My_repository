package com;

public class Manager extends Employee {
	private int numberOfEmp;
	void setManager(int numberOfEmp) {
		this.numberOfEmp=numberOfEmp;
	}
	void disManager(){
//		System.out.println("Manager details");
		System.out.println("Number of Employee is: "+numberOfEmp);
	}

}
