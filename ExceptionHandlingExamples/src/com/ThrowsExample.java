package com;
class VoteException extends Exception{
	public VoteException() {
		
	}
	public VoteException(String msg) {
		super(msg);//es para llamar al constructor de la excepcin
	}
}

public class ThrowsExample {

	public static void main(String[] args) {
		int age = 15;
		try {
			if (age<21) {
				//throw new Exception();
				//throw new Exception ("You can't vote");
				//throw new ArithmeticException();
				//throw new ArithmeticException("You cannot vote);
				//throw new VoteException();
				throw new VoteException("You cannot vote age must be >21");
			}else {
				System.out.println("You can vote");
			}
		}catch (Exception e) {
			System.out.println(e);//esto es igual a e.toString
		}
		System.out.println("finish");
	}

}
