package com;

public class TryCatchAndFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a = 10;
		int b= 1;
		try {
			int res = a /b;
			System.out.println("Result "+ res);
			System.out.println("No exception");
		} catch (Exception e) {// podemos tener try con finally solamente
			System.out.println(e.toString());
		} finally {
			System.out.println("finally block");
		}
		System.out.println("Finish");
	}

}
