package singletone;

// tenemos que crear slo 1 objeto y luego usarlo todo el rato el mismo

class Employee{
	int id;
	private static Employee emp = new Employee();//si lo pongo aqu slo se crea un objeto pero tengo que poner static para que
	// el getInstance lo return tiene que ser static
	private Employee() {
		
	}
	public static Employee getInstance() {
		//Employee emp = new Employee(); //as cada vez que lo llamo creo un objeto que no es lo que quiero
		return emp;
	}
	public void display () {
		System.out.println("This is employee class method"+id);
	}
}
public class DemoTest {
	public static void main(String[] args) {
		//Employee emp = new Employee();// no tenemos que crear los objetos directamente
		//emp.display();
		Employee emp1  =Employee.getInstance();
		emp1.id=10;
		emp1.display();// si lo pongo aqu si que sale 10
		Employee emp2  =Employee.getInstance();
		emp2.id=20;
		emp1.display();//aqu sale 20 pq es la misma memoria
		emp2.display();
		//Employee emp3 = Employee.emp;//para no poder hacer esto y crear otro objeto hayq ue definirlo en Employee como private

	}

}
