package com.product;



import java.util.Scanner;

public class ProductApp {
	
	static Scanner sc = new Scanner(System.in);
	static ProductInfo obj = new ProductInfo();
	static ProductOperatio pd=new ProductOperatio();

 
public  void setData() {

	System.out.println("Enter the product Id");
	obj.setProductId(sc.nextInt());
	System.out.println("Enter the product name ");
	obj.setProductName(sc.next());
	System.out.println("Enter the product Price");
	double price = sc.nextDouble();
	obj.setPrice(price);
	double priceWithGst = price* 1.18;
	obj.setPriceWithGst(priceWithGst);
	System.out.println("Enter the Stok");
	 obj.setStok(sc.nextInt());
	 
	 pd.setData(obj);
	 System.out.println("Product is Added");
	 pd.displayProduct();
	
//	obj.setlocalDateTime(LocalDateTime.now());
//	obj.setUpdatedStatus("the product is new is not updated");
	}
public  void getData() {
//	System.out.println("Enter the product Id :"+obj.getProductId());
//	System.out.println("Enter the product Name :"+obj.getProductName());
//	System.out.println("Enter the product Price :"+obj.getPrice());
//	System.out.println("the price with gst is :"+obj.getPriceWithGst());
//	System.out.println("the product stock is avilable now :"+obj.getStok());
	
//	System.out.println("the product time is :"+obj.getLocalDateTime());
//	System.out.println("the product status is :"+obj.getUpdatedStatus());
	pd.displayProduct();
}
}


//public static void getUpdates() {
//	System.out.println("Enter the Choice : \n press 1 for the Update Id\n press 2 for the Update Product Name\n press 3 for the Update Price\n press 4 for the Update the stok\n press 5 for Nothing to update Move from Customer Information Update");
//	switch(sc.nextInt()) {
//	case 1:
//		System.out.println("the Update Product id");
//		obj.setProductId(sc.nextInt());
//		obj.setlocalDateTime(LocalDateTime.now());
//		obj.setUpdatedStatus("the  Product id is recenty updated");
//		
//		break;
//	case 2:
//		System.out.println("the Update Product Name");
//		obj.setProductName(sc.next());
//		obj.setlocalDateTime(LocalDateTime.now());
//		obj.setUpdatedStatus("the  Product name is recenty updated ");
//		break;
//		
//	case 3:
//		System.out.println("the Update Product price");
//		//obj.setPrice(sc.nextDouble());
//		
//		double price =sc.nextDouble();
//		obj.setPrice(price);
//		double priceWithGst =price*1.18;
//		
//		obj.setPriceWithGst(priceWithGst);
//		
//		obj.setlocalDateTime(LocalDateTime.now());
//		obj.setUpdatedStatus("the  Product Price is recenty updated");
//		break;
//	case 4:
//		System.out.println("the Update Product stok");
//		obj.setStok(sc.nextInt());
//		obj.setlocalDateTime(LocalDateTime.now());
//		obj.setUpdatedStatus("the  Product stok is recenty updated");
//	case 5:
//		System.out.println("Nothing to update");
//		
//		break;
//	}
//
//	
//	
//}


//}

