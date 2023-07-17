package pms.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pms.bean.Product;


public class ProductService {
	private List<Product> listOfProducts = new ArrayList<Product>();

	public String storeProduct(Product product) {//mejor aadir todo el prodcunto que datoa a dato 
		//pq luego te pueden pedir aadir cosas como cantidad color, etc
		int flag=0;
		if(listOfProducts.size()==0) {
		listOfProducts.add(product);//Pero esto no funciona si quiero controlas que determinados valors no se repitan
		return "Product details stored successfully";
		}else {
			Iterator<Product> li = listOfProducts.iterator();
			while(li.hasNext()) {
				Product p = li.next();
				if(p.getPid()==product.getPid()) {
					flag++;
					break;
				}
			}
		}
		if(flag!=0) {
			return "Product must be unique";
			//flag=0;//me lo puedo saltar pq al principio la inicializo
		}else {
			listOfProducts.add(product);
			return "Product details stored successfully";
		}
	}
	public int numberOfProduct() {
		return listOfProducts.size();
		
	}

	
}
