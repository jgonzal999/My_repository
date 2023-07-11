package abc;
class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println("i "+i);
		}
	}	
}
class B extends Thread{
	@Override
	public void run() {
		for(int j=0;j<=50;j++) {
			System.out.println("j "+j);
		}
	}	
}

public class ExtendsThreadClassExample {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		obj1.setPriority(1);
		obj2.setPriority(10);
		obj1.start();//listo para usar el hilo
		obj2.start();
	}

}
