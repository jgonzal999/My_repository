package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(2);ll.add(3);ll.add(1);ll.add(7);ll.add(4);
		System.out.println("Before sort");
		for (int n:ll) {
			System.out.println(n+" ");
			
		}
		Collections.sort(ll);
		System.out.println();
		System.out.println("After sort");
		for (int n:ll) {
			System.out.println(n+" ");
			
		}
		Collections.reverse(ll);
		System.out.println();
		System.out.println("After sort");
		for (int n:ll) {
			System.out.println(n+" ");
			
		}
		List<String> names= new ArrayList<String>();
		names.add("Lex");names.add("Akash");names.add("Vijay");names.add("Ramesh");names.add("akash");names.add("RAMESH".toLowerCase());
		System.out.println("Before sort");
		for (String na:names) {
			System.out.println(na+" ");
			
		}
		Collections.sort(names);
		System.out.println();
		System.out.println("After sort");
		for (String na:names) {
			System.out.println(na+" ");
			
		}
		Collections.reverse(names);
		System.out.println();
		System.out.println("After sort descending");
		for (String na:names) {
			System.out.println(na+" ");
			
		}
		//ejemplito
		String fname="akAsh";// si quiero solo poner en mayusculas la primera tenemos que sacar la primer letra y ponerla en mayusculas
		// luego concatenarla con el resto en minsculas
		char primero =fname.charAt(0);
		System.out.println(primero);
		String fullname=String.valueOf(primero).toUpperCase().concat(fname.substring(1).toLowerCase());
		System.out.println(fullname);
	}

}
