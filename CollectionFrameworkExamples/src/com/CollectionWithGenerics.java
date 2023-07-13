package com;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		List ll = new ArrayList();
		ll.add(10);// auto-boxing : converting primitive to object auto
		ll.add(20.20);
		ll.add("Ravi");
		ll.add(true);
		Object obj = ll.get(0);// object genrico, superclase
		Integer i = (Integer)obj;//converting object to integer object
		int n = i.intValue();//converting integer object to int
		System.out.println(n);
		//Collections framework with generics
		//List ll = new ArrayList();
		//Type is integer, float, cracter, etc
		List<Integer> ll2 = new ArrayList<Integer>();
		ll2.add(10);   //auto-boxing converting primitive to object
		ll2.add(20);
		//ll2.add(10.20); Da errror de compilacion pq tiene que ser integer
		int p = ll2.get(1);//auto-unboxing converting object to primitive
		System.out.println(p);
		
		//Ejemplo con 2 tipos
		Map<Integer,String> rr = new HashMap<Integer,String>();
		rr.put(1,"Ravi");
		System.out.println(rr);
		
		
	}

}
