package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int num[]= {3,1,6,9,2,5,7};
		System.out.println("Display before sort");
		for(int n:num) {
			System.out.println(n+" ");
		}
		Arrays.sort(num);
		System.out.println("Display after sort");
		for(int n:num) {
			System.out.println(n+" ");
		}
		
		String nom[]= {"Pedro","Pepe"," JAvi"};
		System.out.println("Display before sort");
		for(String nn:nom) {
			System.out.println(nn+" ");
		}
		Arrays.sort(nom);
		System.out.println("Display after sort");
		for(String nn:nom) {
			System.out.println(nn+" ");
		}
		System.out.println("Nueva prueba");
		int nume[]= {3,1,6,8,4,3,2};
		System.out.println(Arrays.binarySearch(nume, 1));//esta busqueda lo que hace es buscar en la primera parte
		System.out.println(Arrays.binarySearch(nume, 4));//esta no la encuentra pq est en una parte que no puede estar pq 4 es pequeo
		System.out.println(Arrays.binarySearch(nume, 6));
		Arrays.sort(nume);
		System.out.println(Arrays.binarySearch(nume, 1));//si los ordenamos ya funciona
		System.out.println(Arrays.binarySearch(nume, 4));
		System.out.println(Arrays.binarySearch(nume, 6));
		//if (Arrays.binarySearch(num, key))
		
		String name1="Akash";
		String name2="Aiiiikas";
		System.out.println("\n"+name1.codePointAt(0));
		System.out.println(name2.codePointAt(0));
		System.out.println(name1.compareTo(name2));//saca valores de lo que encuentra igual
		

	}

}
