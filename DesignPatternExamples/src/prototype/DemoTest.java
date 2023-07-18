package prototype;
class Employee{
	double salary;
	public void display () {
		System.out.println("Salario: "+salary);
	}
	public Employee getClone() {
		try {
			Object obj =clone();
			Employee e = (Employee)obj;
			return e;
		}catch(Exception e){
			System.out.println(e);
			return null;
		}
	}
}
public class DemoTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();//nueva memoria
		Employee emp2 = new Employee();//Nueva memoria
		Employee emp3 = emp1;//same memory es lo mismo con 2 referencias ESTO NO ES un CLON
		emp1.salary=12000;
		emp2.salary=14000;
		emp3.salary=16000;
		Employee emp4 = emp2.getClone();
		emp1.display();//16000
		emp2.display();//14000
		emp3.display();//16000 //Esto NO es un clon
		emp4.display();
		emp4.salary=20000;
		emp2.display();
		emp4.display();
		
		
	}

}
