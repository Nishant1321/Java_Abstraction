package com.product;
import java.time.LocalDateTime;

import java.util.*;
public class CustomerApp {
	
	ProductApp pa=new ProductApp();

 static CustomerInfo obj=new CustomerInfo();
 static CustomerOperation co=new CustomerOperation();
  static Scanner sc = new Scanner(System.in);
  public  void setData() {
	  System.out.println("Enter the Customer Name");
	  obj.setCustomerName(sc.next());
	  System.out.println("Enter the Customer Contact No");
	  obj.setContactNo(sc.nextLong());
	 
	
	  System.out.println("Enter the buy the no of product");
	  
	  int product =sc.nextInt();
	  obj.setProduct(product);
	  if(ProductInfo.getStok()<product) {
		  System.out.println("Out Of the Stok..");
		  
		  
	  }else {
		  
		  
		  
		  System.out.println("Enter the Total Amount of Wallet..");
	  int totalAmount=sc.nextInt();
	  obj.setTotalAmount(totalAmount);
	  double finalPrice=ProductInfo.getPrice()*product;
	  obj.setFinalPrice(finalPrice);
	  double giveChange=totalAmount-finalPrice;
	  obj.setGiveChange(giveChange);
	  
	  }
	  obj.setlocalDateTime(LocalDateTime.now());
	  obj.setUpdatedStatus("the new Customer information is not  updated");
	  co.setData(obj);
	  System.out.println("Customer info Added");
  }
  public  void getData() {
	  //System.out.println("the customer Name is :"+obj.getCustomerName());
	//  System.out.println("the customer contact No is :"+obj.getContactNo());
	//  System.out.println("the customer Buying Number of Product is :"+obj.getproduct());
	//  System.out.println("the Total Amount is :"+obj.getTotalAmount());
	//  System.out.println("the Final Price is  :"+obj.getFinalPrice());
	//  System.out.println("the Give Change is  :"+obj.getGiveChange());
	  
	  System.out.println("the product time is :"+obj.getLocalDateTime());
		System.out.println("the product status is :"+obj.getUpdatedStatus());
	  co.DisplayProduct();
    
  }
//  public static void getUpdate() {
//		System.out.println("Enter the Choice : \n press 1 for the Update Customer Name press 2 for the Update Customer Contact No\n press 3 for the No of Product\n press 4 for the Nothing to update");
//		switch(sc.nextInt()) {
//		case 1:
//			System.out.println("the Update Customer Name ");
//			obj.setCustomerName(sc.next());
//		//	obj.setlocalDateTime(LocalDateTime.now());
//			obj.setUpdatedStatus("the  Product id is recenty updated");
//			
//			break;
//		case 2:
//			System.out.println("the Update the Customer Contact No");
//			obj.setContactNo(sc.nextLong());
//			obj.setlocalDateTime(LocalDateTime.now());
//			obj.setUpdatedStatus("the  Product name is recenty updated ");
//			break;
//			
//		case 3:
//			System.out.println("the Update no of product");
//			//obj.setPrice(sc.nextDouble());
//			obj.setProduct(sc.nextInt());
//			obj.setlocalDateTime(LocalDateTime.now());
//			obj.setUpdatedStatus("the  Product Price is recenty updated");
//			break;
//		
//		case 4:
//			System.out.println("Nothing to update");
//			
//			break;
//		
//	}
//  }
//  
  
 

}
