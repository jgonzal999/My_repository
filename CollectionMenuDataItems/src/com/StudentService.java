package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;

public class StudentService {

		//Map<Integer, String> sdtnames = new HashMap<Integer, String>();
		//Map<Integer, String> sdtnames = new LinkedHashMap<Integer, String>();
		Map<Integer,String> stdNames = new TreeMap<Integer,String>(); // cogemeos el que queramos dependiendo de como queremos que sea el objeto
		Scanner sc = new Scanner(System.in);
		
		public void addStudent(){
			try {
			System.out.println("Enter Id: ");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			if(stdNames.containsKey(id)) {
				System.out.println("Key must be unique, no lo guardamos");
			}else {
				stdNames.put(id,name);
			}
			}catch (Exception e) {
				System.out.println("Id debe ser Entero!");
			}
		}
		public void numberOfStudent() {
			System.out.println("Numero de estudiantes"+stdNames.size());
		}
		
		public void displayStudentInfo() {
			System.out.println(stdNames);
			
		}
		public void displayStudentOneByOne() {
			Set<?> ss = stdNames.entrySet();//convert map to set
			Iterator<?> ii = ss.iterator();//creamos iterador
			while(ii.hasNext()) {
				Object std = ii.next();
				System.out.println(std);
			}
			
		}
		public void getOnlyKeys() {
			Set<?> ss = stdNames.keySet();//convert map to set
			Iterator<?> ii = ss.iterator();//creamos iterador
			while(ii.hasNext()) {
				Object key = ii.next();
				System.out.println("Solo Keys: "+stdNames.get(key));
				System.out.println("Solo Valores: "+key);
			}
					
		}
		public void searchDataUsingKey(int key) {
			if (stdNames.containsKey(key)) {
				System.out.println("Your value: "+stdNames.get(key));
			}else {
				System.out.println("NO esta ese valor");
			}
		}
		public void removeData(int key) {
			if (stdNames.containsKey(key)) {
				stdNames.remove(key);
				System.out.println("Borrado");
			}else {
				System.out.println("NO esta ese valor");
			}
		}

		public void close() {
			sc.close();
		}
		
}
