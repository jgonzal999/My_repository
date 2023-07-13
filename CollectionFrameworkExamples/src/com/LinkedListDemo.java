package com;

import java.util.LinkedList;

public class LinkedListDemo {//para meter y sacar es mucho ms fcil con esto que con ArrayList pq las referencias son con el anterior y 
	//posterior slo hay que tocar esa relacion al meter uno nuevo, en cambio ArrayList son posiciones asignadas, y meto un nuevo valor en medio
	//Cambian todas las referencias posteriores

	public static void main(String[] args) {
		LinkedList ll =new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.add(1,100);
		System.out.println(ll);
		ll.addFirst(11);
		ll.addLast(22);
		System.out.println(ll);
		System.out.println("Index 1: "+ll.get(1));
		System.out.println("Primero: "+ll.getFirst());
		System.out.println("Ultimo: "+ll.getLast());
		System.out.println(ll);
		System.out.println("Quito el primero y el ultimo");
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}

}
