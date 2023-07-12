package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();// aparacen ordenados
		ts.add(5);
		ts.add(1);
		//ts.add("Abc"); //Todos tienen que ser del mismo tipo
		ts.add(2);
		ts.add(7);
		ts.add(4);
		ts.add(3);
		System.out.println(ts);
		System.out.println(ts.headSet(5));//saca hasta el 5 NO incluyendolo
		System.out.println(ts.tailSet(3));// saca desde el 3 y se incluye
		System.out.println(ts.subSet(2,4));//saca entre el 2 y el 4, aparece el 2 pero no el 4
	}

}
