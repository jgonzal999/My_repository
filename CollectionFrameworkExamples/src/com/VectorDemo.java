package com;

import java.util.Vector;

public class VectorDemo {// la unica diferencia es que es mas robusto con los multihilos pero es mas lento que los otros

	public static void main(String[] args) {
		Vector vv = new Vector();
		vv.add(10);
		vv.add(20);
		vv.addElement(30);
		System.out.println(vv);
	

	}

}
