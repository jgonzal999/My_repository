package com;

public class RunTimeError {

	public static void main(String[] args) {
		System.out.println("Hi ");
		int a=10;
		int b =0;
		try {
			int res=a/b;
			System.out.println("resutl: "+res);
		}catch(Exception e) {
			System.out.println("Ten cuidado!");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			if (b==0) {
				System.out.println("No se puede dividir por cero");
			}
		}

	}

}
