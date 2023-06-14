package com;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int num[];
		int num1[]= {10,20,30,40,50};
		System.out.println(num1);
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		System.out.println(num1[3]);
		System.out.println(num1[4]);
		System.out.println("Size num1: "+num1.length);
//		int i=0;
//		int n=num1.length;
		for (int i=1,n=10; i<=n; i++) {
			System.out.println("i= "+i);
		}
		System.out.println("Retrieve value from arrray using loop");
		for (int i=0;i<num1.length;i++) {
			System.out.println("Array value ["+i+"] is "+num1[i]);
		}
		System.out.println("How many numbres?: ");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int data[]=new int[size];
		System.out.println("Plz entre "+size+" numbers: ");
		for(int i=0;i<data.length;i++) {
			data[i]=sc.nextInt();
		}
		for (int i=0;i<data.length;i++) {
			System.out.println("Array value ["+i+"] is "+data[i]);
		}
		int sumofnumbers=0;
		int sumOfEven=0;
		int sumOfOdd=0;
		for (int i=0;i<data.length;i++) {
			sumofnumbers=sumofnumbers+data[i];
			if(data[i]%2==0) {
				sumOfEven=sumOfEven+data[i];
			}else {
				sumOfOdd=sumOfOdd+data[i];
				
			}
		}
		System.out.println("Suma: "+sumofnumbers);
		System.out.println("sumOfEven: "+sumOfEven);
		System.out.println("sumOfOdd: "+sumOfOdd);
		sc.close();
	}

}
