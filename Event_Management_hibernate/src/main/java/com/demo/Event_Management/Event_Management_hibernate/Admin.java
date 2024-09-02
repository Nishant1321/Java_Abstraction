package com.demo.Event_Management.Event_Management_hibernate;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String admin_name;
	private String admin_email;
	private long phoneNumber;
	private String admin_address;
	private String password;
	private List<Admin> admin;
	public Admin(int id, String admin_name, String admin_email, long phoneNumber, String admin_address, String password,
			List<Admin> admin) {
		super();
		this.id = id;
		this.admin_name = admin_name;
		this.admin_email = admin_email;
		this.phoneNumber = phoneNumber;
		this.admin_address = admin_address;
		this.password = password;
		this.admin = admin;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAdmin_address() {
		return admin_address;
	}
	public void setAdmin_address(String admin_address) {
		this.admin_address = admin_address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Admin> getAdmin() {
		return admin;
	}
	public void setAdmin(List<Admin> admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", admin_name=" + admin_name + ", admin_email=" + admin_email + ", phoneNumber="
				+ phoneNumber + ", admin_address=" + admin_address + ", password=" + password + ", admin=" + admin
				+ "]";
	}
	
	
	
}
