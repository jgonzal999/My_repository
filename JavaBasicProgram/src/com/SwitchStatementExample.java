package com;
import java.util.Scanner;
public class SwitchStatementExample {

	public static void main(String[] args) {
//		int choice = 5;
//		switch(choice) {
//		case 1:System.out.println("1st block");
//		       break;
//		case 2:System.out.println("2nd block");
//				break;  
//		case 3:System.out.println("3rd block");
//				break;
//		case 4:System.out.println("4th block");
//				break;
//	    default :System.out.println("Wrong block");
//	      	break;
//		}
//		System.out.println("Finish");
		Scanner sc = new Scanner(System.in);
		int choice;		// we can take the value through keyboard. 
		System.out.println("1:Add 2: Sub 3:Mul, 4:Div");
		choice = sc.nextInt();
		int a,b;
		System.out.println("Enter the value of a: ");
		a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		b = sc.nextInt();		
//		int a=10,b=3;
		int add, sub,mul,div;
		switch(choice) {
		case 1 :add = a+b;
			    System.out.println("Addition of two number is "+add);
			    break;
		case 2 :sub = a-b;
			    System.out.println("Sub of two number is "+sub);
			    break;
		case 3 :mul = a*b;
			    System.out.println("Mul of two number is "+mul);
			    break;
		case 4 :div = a/b;
			    System.out.println("div of two number is "+div);
			    break;
		default:System.out.println("Wrong choice");
			    break;
		}
		sc.close();
		System.out.println("Finish");
	}

}
