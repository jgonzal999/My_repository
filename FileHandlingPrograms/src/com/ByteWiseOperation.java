package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class ByteWiseOperation {

	public static void main(String[] args) throws Exception {
		// type : bytewise
		//source : keybo
		//destination : console
		DataInputStream dis = new DataInputStream(System.in);
		PrintStream ps = System.out;
		ps.println("Enter the name");
		String name = dis.readLine();//si no pongo el exceptions no puedo usarlo
		ps.println("Name is "+name);
		
		
		//source : keybo
		//destination : file
		// Lo que hace es crear un txt con un mensaje, acaba con  para finalizar
		DataInputStream dis1 = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("abc.txt"); //sobreescribe
		//FileOutputStream fos = new FileOutputStream("D:\\abc.txt"); //sobreescribe
		//FileOutputStream fos = new FileOutputStream("abc.txt",true);//suma al contenido
		System.out.println("Plz enter the data");
		int ch;
		while ((ch = dis1.read()) != '@') {
			System.out.println(ch+" = "+(char)ch);// printa el valor ascii de cada letra ya que es as como se almacena
			fos.write(ch);
		}
		fos.close();
		System.out.println("Data stored");
		
		
		//source : file
		//destination : file / console
		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos2 = new FileOutputStream("xyz.txt");
		int chh;
		while ((chh=fis.read()) != -1) {//EOF = -1
			fos2.write(ch);		
			
		}
		fis.close();
		fos2.close();
		System.out.println("file copied...");
	}

}
