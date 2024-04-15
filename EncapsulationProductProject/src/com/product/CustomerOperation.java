package com.product;
import java.util.*;

public class CustomerOperation {
static Scanner sc= new Scanner(System.in);
private static ArrayList<CustomerInfo>CustomerList;
public CustomerOperation() {
	CustomerList=new ArrayList();
}
public void setData(CustomerInfo op) {
	CustomerList.add(op);
	
}
public void DisplayProduct() {
	for(CustomerInfo op:CustomerList) {
		System.out.println("**************** Customer Info ****************");
		System.out.println("Enter the Customer Name :"+op.getCustomerName());
		System.out.println("Enter the Customer Contact Number :"+op.getContactNo());
		System.out.println("Enter the customer Buying product :"+op.getproduct());
		System.out.println("Enter the Customer Total Amount:"+op.getTotalAmount());
		System.out.println("Enter the Customer Final Price is :"+op.getFinalPrice());
		System.out.println("Enter the Give Change is  :"+op.getGiveChange());
		
	}
}

}
