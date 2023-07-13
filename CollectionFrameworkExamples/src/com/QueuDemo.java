package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuDemo {//es interface

	public static void main(String[] args) {
		Queue q1 = new LinkedList();
		Queue q2 = new PriorityQueue();
		q1.add(3);q1.add(1);q1.add(4);q1.add(5);q1.add(4);//FIFO
		q2.add(3);q2.add(1);q2.add(4);q2.add(5);q2.add(4);//FIFO con prioridad, el primero de la cola se pone el de mayor prioridad, el resto se deja igual
		System.out.println(q1);//mantiene el oren
		System.out.println(q2);//aqu
		System.out.println(q1.poll());//quita el primero
		System.out.println(q2.poll());//qita el primero on menos prioridad
		System.out.println(q1);
		System.out.println(q2);
		
	}

}
