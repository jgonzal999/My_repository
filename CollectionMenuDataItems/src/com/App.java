package com;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String con;
		StudentService ss = new StudentService();
		int choice;
		
		do {
			System.out.println("1:Anyade estudiante 2:Numero de estudiantes 3:Printar estudiantes 4:Printar uno por uno");
			System.out.println();
			choice=sc.nextInt();
			switch(choice) {
			case 1:ss.addStudent();
				break;
			case 2:ss.numberOfStudent();
				break;
			case 3:ss.displayStudentInfo();
				break;
			case 4:ss.displayStudentOneByOne();
				break;
			default:System.out.println("Mala eleccion");
				break;		
			
			}
			
			System.out.println("quieres continuar? ");
			con = sc.next();
		}while (con.equalsIgnoreCase("y"));
		System.out.println("Adios!!!!");
		sc.close();
		ss.close();

	}

}
