package com;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server ss = new Server();
		System.out.println("Suma: "+ss.add(100, 200));
		System.out.println("Resta: "+ss.sub(100, 200));
		Equipo1 e1 = new Server();
		System.out.println("Equipo1 "+e1.add(100, 200));
		// solo puedo hacer add con este objeto ya que el sub est en EQUIPO2
		Equipo2 e2 = new Server();
		System.out.println("Equipo2 "+e2.sub(200, 100));

	}

}
