package typecasting;


class A{
	void dis1() {
		System.out.println("A class metodo dis");
	}
}

class B extends A{
	void dis1() {
		System.out.println("B sobreescribe dis de A");
	}
	void dis2() {
		System.out.println("B class dis 2");
	}
}

public class DemoTest2 {

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.dis1();
		B obj2 = new B();
		obj2.dis1();
		obj2.dis2();
		//B obj3 = new A();// creo objeto super class y la referencia de subcalse, esto no se puede hacer
		A obj4 = new B();// el objeto creado es de tipo A pero las referencias de mtodos es de B.Implicit type casting
		obj4.dis1();// solo podemos llamar a los metodos de A
		//B obj5 = obj4;//error
		B obj5 = (B)obj4;//down level type casting
		obj5.dis2();//ya puedo usar el dis2
		
		//
		A objj1= new A();
		Object objj2 = new A(); //solo puedo usar el dis1
		
		objj1.dis1();
		//objj2.dis1(); //no puedo hacerlo pq es Object y Object no tiene dis
		A objj3 =(A)objj2;//
		objj3.dis1();//Ahora si 
		
	}

}
