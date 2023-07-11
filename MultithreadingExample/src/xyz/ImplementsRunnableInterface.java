package xyz;


class A implements Runnable{//es un interface por lo que tiene metodos abstractos que hay que hacerlos, 
	//implements es mejor pq puedo hacerlo de varias cosas para la clase A y adems pesa menos que hacer un extends
	
	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println("i "+i);
		}
	}
}
class B implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<=50;j++) {
			System.out.println("j "+j);
		}
	}
}

public class ImplementsRunnableInterface {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
