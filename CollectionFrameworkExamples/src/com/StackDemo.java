package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		System.out.println(ss);
		System.out.println("Pop "+ss.pop());
		System.out.println(ss);
		System.out.println("Peek "+ss.peek());
		System.out.println(ss);
		System.out.println("Search 30 "+ss.search(30));
		System.out.println("Search 10 "+ss.search(10));
		System.out.println("Search 300 "+ss.search(300));
		System.out.println(ss);

	}

}
