package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		Map mm1 = new HashMap();// los ordena segun el key
		Map mm2 = new LinkedHashMap();//mantiene el orden segn los pones
		Map mm3 = new TreeMap();//Key del mismo tipo y los ordena segun el key
		Map mm4 = new Hashtable();
		mm1.put(2, "Lex");
		mm1.put(1, "Ajay");
		mm1.put(3, "Steven");
		mm1.put("Abc", "Lex");
		System.out.println(mm1+"\n");
		mm2.put(2, "Lex");
		mm2.put(1, "Lex");
		mm2.put(3, "Lex");
		mm2.put("Abc", "Lex");
		System.out.println(mm2+"\n");
		mm3.put(2, "Lex");
		mm3.put(1, "Lex");
		mm3.put(3, "Lex");
		//mm3.put("Abc", "Lex");
		System.out.println(mm3+"\n");
		mm4.put(2, "Lex");
		mm4.put(1, "Lex");
		mm4.put(3, "Lex");
		mm4.put("Abc", "Lex");
		System.out.println(mm4+"\n");
		

	}

}
