package EncapsulationProjectProduct;
import java.util.*;
import EncapsulationProjectProduct.*;
public class ProductMyApp {
	public static void getProductInfo() {

	Scanner sc=new Scanner(System.in);
	boolean b= true;
	while(b) {
	System.out.println("Enter the choice : \n press 1 for the setdata \n press 2  for getdata\n press 3 for the Update the data\npress 4 for the Exist");
	// TODO Auto-generated method stub
	switch(sc.nextInt()) {
	case 1:
		ProductApp.setData();
		System.out.println(" ");
		//CustomerApp.setData();
		break;
		
	case 2:
		ProductApp.getData();
		System.out.println(" ");
		//CustomerApp.getData();
		break;
	case 3:
		ProductApp.getUpdates();
		System.out.println(" ");
		//CustomerApp.getUpdate();
		break;
	case 4:
		b=false;
		break;
		
	}


	}


}
}