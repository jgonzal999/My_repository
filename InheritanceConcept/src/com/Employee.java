package com;

public class Employee {
	private int id;
	private String name;
	private float salary;
	public void setEmployee(int id, String name, float salary) {
		this.id=id; // this.id is the instance variable and id is local variable
		this.name=name;
		this.salary = salary;
	}

	void disEmployee() {
//		System.out.println("Employee details");
		System.out.println("id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	
}
