package assig5;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private String designation;
	Scanner sc = new Scanner(System.in);
	public void read() {
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Salary");
		salary=sc.nextFloat();
		System.out.println("designation");
		designation=sc.next();
	}

}
