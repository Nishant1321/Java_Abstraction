package com.product;
import java.util.*;


public class ProductMyApp {

	//public static void main(String[] args) {
	public static void getProductInfo() {
		ProductApp pa=new ProductApp();
		
		ProductOperatio pd = ProductApp.pd;
		boolean b=true;
		while(b) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the choice : \n Press 1 for the setDAta \n press 2 for the GetData\npress 3 for the update the product \n press 4 for the exist");
switch(sc.nextInt()) {
case 1 :
	pa.setData();
	break;
case 2 :
	pd.displayProduct();
	break;
case 3:
//	ProductApp.getUpadate();
case 4:
	b=false;
	break;
}

	}

}
}