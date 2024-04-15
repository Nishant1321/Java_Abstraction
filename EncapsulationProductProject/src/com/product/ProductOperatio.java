package com.product;
import java.util.*;
import java.util.ArrayList;


public class ProductOperatio {
	static Scanner sc= new Scanner(System.in);
	static ProductInfo obj= new ProductInfo();
	private static ArrayList<ProductInfo>ProductList;
	public  ProductOperatio() { 
		ProductList=new ArrayList();
		
		
	}
	public void setData(ProductInfo op) {
		ProductList.add(op);
	}
	public  void displayProduct() {
		for(ProductInfo op: ProductList) {
			System.out.println("**************** Product Info ****************");
			System.out.println("product Id :"+op.getProductId());
			System.out.println("product Name :"+op.getProductName());
			System.out.println("product Price :"+op.getPrice());
			System.out.println("price with Gst :"+op.getPriceWithGst());
			System.out.println("Stock Avilable :"+op.getStok());
			
		}
	}
	public void check(String name) {
		for(ProductInfo pd: ProductList) {
			String existingProduct=pd.getProductName();
			if(name.equals(existingProduct)) {
				System.out.println("found");
				break;
				
			}
			
		}
	}

}
