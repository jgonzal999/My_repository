package com.main;

import com.bean.Product;//aqui si que puedo usar el .* pq hy pocas clases
import java.util.Scanner;//.* lo importa todo y eso carag mucho, no es buena idea

public class DemoTest {

	public static void main(String[] args) {
		Product p = new Product();//aqui solo creamos la memoria
		Scanner sc = new Scanner(System.in);
		p.setId(100);
		p.setPname("TV");
		p.setPrice(450000);
		
		Product p1 = new Product(101,"Computer",95000);//aqui creamos la memoria y metemos los datos
		System.out.println("PId: "+p.getId());
		System.out.println("Name: "+p.getPname());
		System.out.println("Precio: "+p.getPrice());
		System.out.println("PId: "+p1.getId());
		System.out.println("Name: "+p1.getPname());
		System.out.println("Precio: "+p1.getPrice());
		
		System.out.println(p);//cuando ahcemos esto llamamos a toString() de forma	auto, 
		//si sobreescribimos este metodo en nuestra clase saldr otra cosa	
		
		
	}

}
