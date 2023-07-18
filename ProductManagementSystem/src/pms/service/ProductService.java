package pms.service;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import pms.bean.Product;
import pms.exception.ProductPriceException;


public class ProductService {
	private List<Product> listOfProducts = new ArrayList<Product>();

	public String storeProduct(Product product) {//mejor aadir todo el prodcunto que datoa a dato 
		//pq luego te pueden pedir aadir cosas como cantidad color, etc
		int flag=0;
		try {
		
		if(listOfProducts.size()==0) {
		//listOfProducts.add(product);//Pero esto no funciona si quiero controlas que determinados valors no se repitan
			if(product.getPrice()<1000) {
				throw new ProductPriceException("Price must be > 1000");
			}else {
				listOfProducts.add(product);
				return "Product details stored succcessfully";
			}
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
		}else if (product.getPrice()<10000.0) {
			throw new ProductPriceException("Price must be > 1000");
			
		}else {
			listOfProducts.add(product);
			return "Product details stored successfully";
		}
		}catch(Exception e) {
			//System.out.println(e);
			return e.getMessage();
		}
		}
	public int numberOfProduct() {
		return listOfProducts.size();
		
	}
	public String deleteProduct(int pid) {
		int flag=0;
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==pid) {
				li.remove();
				//return "Borrado" puedo acabarlo as y me evito todo lo del flag
				flag++;
				break;
			}
		}
		if(flag==0) {
			return "Product no existe";
			//flag=0;//me lo puedo saltar pq al principio la inicializo
					
		}else {
			return "Product remove successfully";
		}
		

	}
	public String updateProduct(Product product) {
		int flag=0;
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==product.getPid()) {
				p.setPrice(product.getPrice());
				flag++;
				break;
			}
		}
		if(flag==0) {
			return "Product no existe";
			//flag=0;//me lo puedo saltar pq al principio la inicializo
					
		}else {
			return "Product update successfully";
		}	

	}
	public List<Product> displayAllProduct(){
		return listOfProducts;
	}
	
}
