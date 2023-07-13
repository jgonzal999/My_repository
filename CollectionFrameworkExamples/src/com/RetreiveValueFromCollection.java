package com;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RetreiveValueFromCollection {

	public static void main(String[] args) {
		// array value retrieve using for each or enhanced loop
		int abc[]= {10,20,30,40};
		System.out.println();
		for(int n:abc) {
			System.out.println(n);
		}
		Set ss=new HashSet();
		ss.add(10); ss.add(20);ss.add("Ravi");ss.add(40.50);
		System.out.println("\n"+ss);
		for(Object s:ss) {
			System.out.println(s);
		}
		List ll = new ArrayList();
		ll.add(1);ll.add(5);ll.add(8);ll.add(3);
		System.out.println();
		for(Object l:ll) {
			System.out.println(l);
		}
		//del objeto ss anterior voy a ahcer un iterador
		Iterator ii = ss.iterator();		
		while(ii.hasNext()) {
			Object obj = ii.next();
			ii.remove();
			System.out.println(obj);
		}
		System.out.println(ss);
		
		Map mm = new HashMap();
		mm.put("A", "B");
		mm.put("C", "D");
		mm.put("E", "F");
		System.out.println(mm);
		Set ss1 = mm.entrySet();// converting map to set
		Iterator ii1= ss1.iterator();
		while(ii1.hasNext()) {
			Object obj = ii1.next();
			System.out.println(obj);
			}
		
		
		
		
	}

}
