package com.demo.Customer.Customer_hibername;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
private int cust_id;
private String cust_name;
private int cust_age;
public Customer(int cust_id, String cust_name, int cust_age) {
	super();
	this.cust_id = cust_id;
	this.cust_name = cust_name;
	this.cust_age = cust_age;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public int getCust_age() {
	return cust_age;
}
public void setCust_age(int cust_age) {
	this.cust_age = cust_age;
}
@Override
public String toString() {
	return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_age=" + cust_age + "]";
}


}
