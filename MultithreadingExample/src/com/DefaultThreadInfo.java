package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);//Thread[main,5,main] es lo que saca, main nombre del hilo, 5 prioridad (1 a 10), main nombre de grupo de hilos
		t.setName("My Thread");
		t.setPriority(1);
		System.out.println(t);
	}

}
