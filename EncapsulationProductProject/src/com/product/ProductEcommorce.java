package com.product;
import java.util.Scanner;

public class ProductEcommorce {

	public static void main(String[] args) {
		while(true) {
		System.out.println("In the Product Shop :\n press 1 for the Product Inforamtion  \n press 2 for the Product Billing");
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
switch(sc.nextInt()) {
case 1:
	System.out.println("***********Prduct Information  **************");
ProductMyApp.getProductInfo();
	//CustomerMyApp.getProductInfo();

	break;
case 2:
	System.out.println("***********Product Billing  **************");
	CustomerMyApp.getProductInfo();
	
	break;
	}

}
}
} 