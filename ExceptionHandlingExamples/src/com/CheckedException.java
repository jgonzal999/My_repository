package com;

public class CheckedException {

	public static void main(String[] args) throws Exception{//podemos usar throw o try/catch o amobos
		System.out.println("Hello");
		try {
			Thread.sleep(5000);// se mira en la compilacion y no puedes ignorar que tienes que tratar la excepcin pq es peligroso
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println("Take tea break");
	}

}
