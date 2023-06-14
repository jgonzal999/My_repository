package com;

public class App {

	public static void main(String[] args) {
		Car innova = new Car();
		Car bmw = new Car();
		innova.start();
		innova.stop();
		bmw.start();
		bmw.stop();
		innova.wheel=4;
		innova.colour="Red";
		innova.price=350000;
		bmw.wheel=5;
		bmw.colour="Pink";
		bmw.price=100000.83;
				
		System.out.println("Innova Car details: ");
		System.out.println("Wheel "+innova.wheel);
		System.out.println("Colour: "+innova.colour);
		System.out.println("Price: "+innova.price);
		System.out.println("BMW Car details: ");
		System.out.println("Wheel "+bmw.wheel);
		System.out.println("Colour: "+bmw.colour);
		System.out.println("Price: "+bmw.price);

	}

}
