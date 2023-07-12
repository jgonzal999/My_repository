package com;

class Work implements Runnable{
	
	@Override
	public synchronized void run() {//si pong syncr consigo que haga primero 1 y luego pase al siguiente
		Thread t = Thread.currentThread();
		String name = t.getName();
		try {
			for(int i=0;i<=10;i++) {
				System.out.println(name+" "+i);
				if (i==5 && name.equals("Javi")) {
					wait();//esto hace que se quede esperando
				}
				if (i==6 && name.equals("Maria")) {
					notify();//esto permite a uno que est en wait que pueda continuar
					wait();
				}
				if (i==2 && name.equals("Enrique")) {
					notify();//esto permite a uno que est en wait que pueda continuar
					wait();
				}
				Thread.sleep(1000);//esto hace que espere 1 segundo
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class InnerThreadCommunication {

	public static void main(String[] args) {
		Work b1 = new Work();//con este ejemplo a veces todos salen con ticket, depende de la velocidad del processador
		//Booking b2 = new Booking(); //Si hago uno para cada uno entonces tendre 3 avl, no funciona y todos tiene ticket
		//Booking b3 = new Booking();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		t1.setName("Javi");
		t2.setName("Maria");
		t3.setName("Enrique");
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();


	}

}
