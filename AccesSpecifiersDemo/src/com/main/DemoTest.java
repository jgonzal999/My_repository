package com.main;

import com.bean.Employee;
import com.bean.Manager;
import com.entity.Developer;
import com.service.Proyect;

public class DemoTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("----");
		emp.empInfo();
		System.out.println("----");
		Manager mgr =new Manager();
		System.out.println("----");
		mgr.managerInfo();
		System.out.println("----");
		Developer dd = new Developer();
		System.out.println("----");
		dd.devInfo();
		System.out.println("----");
		Proyect pp = new Proyect();
		System.out.println("----");
		pp.empDetails();
		System.out.println("----");
	}

}