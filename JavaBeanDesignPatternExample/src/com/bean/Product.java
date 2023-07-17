package com.bean;

public class Product {
	private int id;
	private String pname;
	private float price;
	
	
	public Product() {
		super();// todos los constructoes pueden llamar a super para contruirlo pero si no lo pones no pasa nada
	}
	public Product(int id, String pname, float price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
//	@Override
//	public String toString() {
//		return "This product tiene este ";
//	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + "]" + super.toString(); //asi puedo usar el to string original
	}

}
