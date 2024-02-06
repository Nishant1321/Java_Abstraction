package EncapsulationProjectProduct;
import EncapsulationProjectProduct.*;
import java.util.*;
public class CustomerMyApp {
	public static void getProductInfo() {

	Scanner sc=new Scanner(System.in);
	boolean b =true;
	
	while(b) {
	System.out.println("Enter the choice : \n press 1 for the setdata \n press 2  for getdata\n press 3 for the Update the data\npress 4 for the Exit");
	// TODO Auto-generated method stub
	switch(sc.nextInt()) {
	case 1:
		CustomerApp.setData();
		break;
	case 2:
		CustomerApp.getData();
		break;
	case 3:
		CustomerApp.getUpdate();
		break;
	case 4:
		b=false;
		break;
		
	}
	

	}


}
}