package com.demo.Product.Product_hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int product_id;
	private String product_name;
	private double product_price;
	public Product(int product_id, String product_name, double product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return "product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + "]";
	}
	

}
