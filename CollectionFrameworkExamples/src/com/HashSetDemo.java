package com;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet<>();
		System.out.println("Size: "+hs.size());
		System.out.println("Vacio?: "+hs.isEmpty());
		hs.add(10);
		hs.add(10);//lo ignora pq no se pueden repetir, no da error
		hs.add(10.20);
		hs.add("Lex");
		hs.add(true);
		System.out.println("Size: "+hs.size());
		System.out.println("Vacio?: "+hs.isEmpty());
		System.out.println(hs);
		hs.remove("Lex");// para eliminar tenfo que decir el elemento
		hs.remove(9);//si no existe no pasada nada
		System.out.println("Puedes borrar el 9? "+hs.remove(9));// devuelve false
		System.out.println(hs);
		System.out.println("Busca 10: "+hs.contains(10));
		System.out.println("Busca 100: "+hs.contains(100));
		hs.clear();
		System.out.println(hs);
		System.out.println("Size: "+hs.size());
	}

}
