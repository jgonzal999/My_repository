package com;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map mm1 = new HashMap();
		mm1.put(2, "Lex");
		mm1.put(1, "Stevenx");
		mm1.put(3, "Raju");
		System.out.println(mm1);
		mm1.put(1, "Neena");//como la key 1 existe pues reemplazamos
		mm1.put(5, "Lex");
		System.out.println(mm1);
		System.out.println("Buscar si existe la key 1: "+mm1.containsKey(1));
		System.out.println("Buscar si existe la key 10: "+mm1.containsKey(10));//false
		System.out.println("Buscar el valor Lex: "+mm1.containsValue("Lex"));
		System.out.println("Buscar el valor Ajay: "+mm1.containsValue("Ajay"));//false
		System.out.println("Buscar el valor del index 1: "+mm1.get(1));
		System.out.println("Buscar el valor del index 10: "+mm1.get(10));//No existe da null
		mm1.remove(1);
		System.out.println(mm1);
		
		

	}

}
