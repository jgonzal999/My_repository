package pms.main;

import java.util.List;
import java.util.Scanner;
import pms.bean.Product;
import pms.service.ProductService;


public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		int pid;
		String pname;
		float price;
		String con;
		int choice;
		String result;
		do{
			System.out.println("1:Add Product 2:Number of products");
			System.out.println("Elige por favor");
			choice=sc.nextInt();
			switch(choice) {
			case 1: System.out.println("Add Product ");
				System.out.println("Enter de id: ");
				pid=sc.nextInt();
				System.out.println("Enter de name: ");
				pname=sc.next();
				System.out.println("Enter de price: ");
				price=sc.nextFloat();
				Product p = new Product(pid,pname,price);
				result = ps.storeProduct(p);
				System.out.println(result);
				break;
			case 2: System.out.println("Number of products ");
				System.out.println("Number of products: "+ps.numberOfProduct());
				break;
			case 3:System.out.println("Plz enter product id to delete the product");
		        pid = sc.nextInt();
		        result = ps.deleteProduct(pid);
		        System.out.println(result);
		        break;
			case 4:System.out.println("Plz enter product id to update price");
		       pid = sc.nextInt();
		       System.out.println("Plz enter new price");
		       price = sc.nextFloat();
		       Product pp = new Product();
		       pp.setPid(pid);
		       pp.setPrice(price);
		       result = ps.updateProduct(pp);
		       System.out.println(result);
		       break;
			case 5:System.out.println("All Product details");
		       List<Product> listOfProduct = ps.displayAllProduct();
		       for(Product product:listOfProduct) {
		    	   System.out.println(product);  // it will call toString method 
		       }
		       break;
			default:System.out.println("Mala eleccion!!!!!");
			}
			System.out.println("Do you to continue? ");
			con= sc.next();						
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank you! Bye!");
		
	}

}
