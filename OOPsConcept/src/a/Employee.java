package a;

public class Employee {
	private int id;
	private String name;
	private float salary;
	Employee(){
		System.out.println("Object created...");
		id=123;
		name="Unknow";
		salary=50000;
	}
	Employee(int id1,String name1,float salary1){
//		System.out.println("Object created...");
		id=id1;
		name=name1;
		salary=salary1;
	}
	void setValue(int id1,String name1,float salary1) {
		id=id1;
		name=name1;
		salary=salary1;
	}
	void display() {
		System.out.println("id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Salary: "+salary);
	}

}
