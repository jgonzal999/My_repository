package com;

class Booking implements Runnable{
	int avl=1;//para cada llamada voy a crear un avl distinto en una nueva posicin de memoria
	@Override
	public synchronized void run() {//Con el sincronize lo que haceos es ejecutar un hilo cada vez y bloquear para que se haga de 1 en 1
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}

public class BookingApp {

	public static void main(String[] args) {
		Booking b1 = new Booking();//con este ejemplo a veces todos salen con ticket, depende de la velocidad del processador
		//Booking b2 = new Booking(); //Si hago uno para cada uno entonces tendre 3 avl, no funciona y todos tiene ticket
		//Booking b3 = new Booking();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		t1.setName("Javi");
		t2.setName("Maria");
		t3.setName("Enrique");
		t1.setPriority(1);
		t2.setPriority(6);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();

	}

}
