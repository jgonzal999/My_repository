package com.entity;
import com.bean.Employee;

public class Developer extends Employee {
	public void devInfo() {
		//System.out.println("Id: "+id); private
		//System.out.println("Id: "+name); default solo en el mismo package
		System.out.println("Id: "+salary);
		System.out.println("Id: "+designation);
	}

}
