package com;
class Task implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for (int i=0;i<=10;i++) {
			System.out.println(t);
			System.out.println(name+"  "+i);
		}
		
	}
	
}

public class OneClassMoreThanOneThread {

	public static void main(String[] args) {
		Task obj1 = new Task();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj1);
		Thread t3 = new Thread(obj1);
		t1.setName("Javi");
		t2.setName("Maria");
		t3.setName("Enrique");
		//System.out.println("creados");
		t1.setPriority(1);
		t2.setPriority(6);
		t3.setPriority(10);
//		System.out.println("prioridad");
		t1.start();
		t2.start();
		t3.start();
//		System.out.println("comenzamos");
		

	}

}
