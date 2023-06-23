package com.bean;

public class Manager extends Employee {
	public void managerInfo() {
		//System.out.println("Id: "+id); no se puede es private
		System.out.println("Id: "+name);
		System.out.println("Id: "+salary);
		System.out.println("Id: "+designation);
	}

}
