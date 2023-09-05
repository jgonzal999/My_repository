package com.service;
//Primero tenemos que bajarnos jUnit 14.2 jar
//luego boton derecho sobre el proyexto - Properties - Java Build Path (libraries) - add externals JAR y aadimos el jar que nos hemos bajado
//Hay que anyadir tambien harmcrest 2.1
//despues sobre la clase Operaciones, boton derech NEW -> jUnit Test Case y elegimos los mtodos

public class Operation {
	public int add (int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int sub (int a, int b) {
		int sum=a-b;
		return sum;
	}
	public int mul (int a, int b) {
		int sum=a*b;
		return sum;
	}
	public int div (int a, int b) {
		int sum=a/b;
		return sum;
	}
}
	
