package com;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Size arraylist inicial: "+al.size());
		int num[] = new int[10];
		System.out.println("Size array normal: "+num.length);
		al.add(10);
		al.add(10.20);
		al.add("Ravi");
		al.add(true);
		System.out.println("Size arraylist inicial: "+al.size());
		System.out.println(al+"\n");
		ArrayList al2 = new ArrayList();
		System.out.println("Size arraylist inicial: "+al2.size());
		al2.add("Lex");
		al2.add("Steve");
		al2.add("John");
		System.out.println(al2);
		System.out.println("Size arraylist inicial: "+al2.size());
		System.out.println("0 index posicion value "+al2.get(0));
		System.out.println("1 index posicion value "+al2.get(1));
		//System.out.println("Posicion erronea "+al2.get(4));
		al2.add("Raju");
		al2.add(1,"Neena");//pongo a Neena en la posicion 1
		System.out.println(al2);
		al2.remove(2);//podemos borrar por posicion, cuando ponemos un nmero por defecto es el index
		Integer a=2;//object
		int b=2;//esto es un valor primitivo
		al2.remove(a);//si queremos borrar un numero, no una posicin, tenemos que hacer esto, borra el numero 2 en la posicion que sea
		al2.remove(b);//esto lo que borra es la posicin 10
		al2.remove("John");
		System.out.println(al2);
		System.out.println("Buscar Lex: "+al2.contains("Lex"));//dice si esta o no
		System.out.println("Buscar Akash: "+al2.contains("Akash"));
		System.out.println("Posicin de Lex: "+al2.indexOf("Lex"));//Encuentra la posicion
		System.out.println("Posicin de Akash: "+al2.indexOf("Akash"));
		

	}

}
