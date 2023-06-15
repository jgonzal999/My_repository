package com;

public class OperatorExample {

	public static void main(String[] args) {
		int a=10,b=3;
		int add,sub,mul,div,mod;
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
		System.out.println("Arithmetic operation");
		System.out.println("Add "+add);
		System.out.println("Sub "+sub);
		System.out.println("Mul "+mul);
		System.out.println("Div "+div);
		System.out.println("Mod "+mod);
		boolean res1,res2,res3;
		res1=a>b;
		res2=a<b;
		res3=a!=b;
		System.out.println("Result1 "+(a>b));
		System.out.println("Result2 "+res2);
		System.out.println("Result3 "+res3);
		int n=10;
		System.out.println("Value of n is "+n);
		n=n+1;
		System.out.println("Value of n is "+n);
		n++;
		System.out.println("Value of n is "+n);

	}

}
