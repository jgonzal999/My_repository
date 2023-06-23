package com.bean;

public class Employee {
	private int id;// private solo en esta clase
	String name;// default solo en el mismo package
	protected float salary; // solo si es subclase
	public String designation;// siempr se puede usar
	public void empInfo() {
		System.out.println("Id: "+id);
		System.out.println("Id: "+name);
		System.out.println("Id: "+salary);
		System.out.println("Id: "+designation);
		calcsalary();
	}
	private void calcsalary() {
		System.out.println("Salario: "+(salary+1000));
	}
	

}
