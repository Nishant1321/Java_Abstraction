package com.product;
import java.time.LocalDateTime;
	import java.time.LocalDateTime;
	public class CustomerInfo {

	private String customerName;
	private long contactNo;
	private static int product;
	private LocalDateTime localDateTime;
	private String updatedStatus;
	private int totalAmount;
	private double finalPrice;
	private double giveChange;
	//set- getMethod customerName
	public CustomerInfo(String customerName,long contactNo,int product,int totalAmount,double finalPrice,double giveChange ) {
		this.customerName=customerName;
		this.contactNo=contactNo;
		this.product=product;
		this.totalAmount=totalAmount;
		this.finalPrice=finalPrice;
		this.giveChange=giveChange;
		
	}
	public CustomerInfo() {
		
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
		
		
	}
	public String getCustomerName() {
		return customerName;
	}
	//se-get method for contactNo;
	public void setContactNo(long contactNo) {
		this.contactNo=contactNo;
		
		
	}
	public long getContactNo() {
		return contactNo;
	}

	//se-get method for Product;
	public void setProduct(int product) {
		this.product=product;
		
		
	}
	public static int getproduct() {
		return product;
	}
	//setter-getter method for LocalDateTime
	public void setlocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime=localDateTime;
		
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	//setter-getter method for product Updated Status
	public void setUpdatedStatus(String updatedStatus) {
		this.updatedStatus=updatedStatus;
		
	}
	public String getUpdatedStatus() {
		return updatedStatus ;
	}
	//setter-getter method for product Total Amount
	public void setTotalAmount(int totalAmount) {
		this.totalAmount=totalAmount;
		
	}
	public int getTotalAmount() {
		return totalAmount;
	}

	//setter-getter method for product FinalPrice
	public void setFinalPrice(double finalPrice) {
		this.finalPrice=finalPrice;
		
	}
	public double getFinalPrice() {
		return finalPrice;
	}

	//setter-getter method for product giveChange
	public void setGiveChange(double giveChange) {
		this.giveChange=giveChange;
		
	}
	public double getGiveChange() {
		return giveChange;
	}
	}

