package com;

abstract class Bank {
	// como he definido un metodo abstract es obligatorio definir la clase como abstract
	abstract void withdraw();
	void deposit() {
		System.out.println("Deposito....");
	}

}
