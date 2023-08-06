package staticfactory;
//Aqui no permitimos que la calse crea el objeto, lo crea otra clase
class Employee{
	private Employee() {
		
	}
	public void display () {
		System.out.println("This is employee class method");
	}
	public static Employee getInstance() {
		//podemos poner codigo para ver si lo permitimos o no
		Employee emp = new Employee();
		int code=1;
		if (code==1) {
		return emp; //por eso ponemos Employee despues de public static
		}else {
			return null;
		}
		
	}
}

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();// no tenemos que crear los objetos directamente
		//emp.display();
		Employee e =Employee.getInstance();
		e.display();
		//Employee a = new Employee; No podemos hacer esto porque hay un constructor private
		

	}

}
