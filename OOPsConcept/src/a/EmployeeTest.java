package a;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
//		emp1.id=100;        ya no se pueden acceder pq son private
//		emp1.name="lex";
//		emp1.salary=12000;
//		emp2.id=101;
//		emp2.name="Steven";
//		emp2.salary=14000;
		emp1.setValue(100,"Lok",15000);
		emp2.setValue(101,"Lo",16000);
		emp3.setValue(102,"Lokesh",18000);
		emp1.display();
		emp2.display();
		emp3.display();
//		System.out.println("Desde aqui "+ emp3.id); ya no se puede porque son privadas
		
		Employee emp4=new Employee();
		emp4.display();
		Employee emp5=new Employee(104,"Mahesh",20000);
		emp5.display();

	}

}
