package com;

public class RuntimeException {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a = 10;
		int b=1;
		int res[]= {100,200,300,400};
		try {
		int result = a/b;
		System.out.println("Result "+result);
		int result1 = 100/res[5];
		System.out.println("Result "+result1);
		}catch(ArithmeticException e){ //Solo para el 10/0
			System.out.println("I take care!");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
		}catch(ArrayIndexOutOfBoundsException e){//Solo para el res[5]
			System.out.println("I take care!");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
		}catch(Exception e){//para el resto
			System.out.println("I take care!");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
		
	}

}
