package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a = 10;
		int b=1;
		int abc[]= {100,200,300,400};
		String info = "abc10";
		try {
		int result = a/b;
		System.out.println("Result "+result);
		int result1 = 100/abc[0];
		System.out.println("Result "+result1);
		System.out.println(info+10);
		System.out.println(Integer.parseInt(info)+10);// Integer es un type que contiene el metodo parseInt para pasarlo a numero
		System.out.println("No exception");
		}catch(ArithmeticException e){ //Solo para el 10/0
			System.out.println("Dived by zero!");
			System.out.println(e.toString());
		}catch(ArrayIndexOutOfBoundsException e){//Solo para el res[5]
			System.out.println("Fuera de orden ");
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println("Generic: "+e.toString());
		}
		System.out.println("Normal Statement");

	}

}
