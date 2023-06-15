package com;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee empl = new Employee();
		empl.setEmployee(100,"Steven",15000);
		System.out.println("Employee details");
		empl.disEmployee();
		
		Manager mgrl=new Manager();
		mgrl.setEmployee(101,"Lex",45000);
		mgrl.setManager(15);
		System.out.println("Manager details");
		mgrl.disEmployee();
		mgrl.disManager();
		
		
		Developer devl=new Developer();
		devl.setEmployee(102,"Neena",28000);
		devl.setDeveloper("Java Tech");
		System.out.println("Developer details");
		devl.disEmployee();
		devl.disDeveloper();
	}
}
