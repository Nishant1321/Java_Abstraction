package com.demo.Event_Management.Event_Management_hibernate;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cust_id;
	private String cust_name;
	private String cust_email;
	private long phoneNumber;
	private String cust_address;
	private String password;
	@ManyToMany
	private List<EventOrganizer> eventOrganizer;
	public Customer(int cust_id, String cust_name, String cust_email, long phoneNumber, String cust_address,
			String password, List<EventOrganizer> eventOrganizer) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_email = cust_email;
		this.phoneNumber = phoneNumber;
		this.cust_address = cust_address;
		this.password = password;
		this.eventOrganizer = eventOrganizer;
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
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<EventOrganizer> getEventOrganizer() {
		return eventOrganizer;
	}
	public void setEventOrganizer(List<EventOrganizer> eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_email=" + cust_email
				+ ", phoneNumber=" + phoneNumber + ", cust_address=" + cust_address + ", password=" + password
				+ ", eventOrganizer=" + eventOrganizer + "]";
	}
	
	
	
	

}
